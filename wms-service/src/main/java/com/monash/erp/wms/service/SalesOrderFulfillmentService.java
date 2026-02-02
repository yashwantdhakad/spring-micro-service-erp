package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.InventoryReservationAllocationDto;
import com.monash.erp.wms.dto.InventoryReservationItemRequest;
import com.monash.erp.wms.dto.InventoryReservationItemResponse;
import com.monash.erp.wms.dto.InventoryReservationRequest;
import com.monash.erp.wms.dto.InventoryReservationResponse;
import com.monash.erp.wms.dto.SalesOrderPicklistItemRequest;
import com.monash.erp.wms.dto.SalesOrderPicklistRequest;
import com.monash.erp.wms.dto.SalesOrderPicklistResponse;
import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.entity.InventoryItemDetail;
import com.monash.erp.wms.entity.Picklist;
import com.monash.erp.wms.entity.PicklistBin;
import com.monash.erp.wms.entity.PicklistItem;
import com.monash.erp.wms.entity.PicklistStatus;
import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.entity.ShipmentItem;
import com.monash.erp.wms.entity.ShipmentRouteSegment;
import com.monash.erp.wms.entity.ShipmentStatus;
import com.monash.erp.wms.repository.InventoryItemDetailRepository;
import com.monash.erp.wms.repository.InventoryItemRepository;
import com.monash.erp.wms.repository.PicklistBinRepository;
import com.monash.erp.wms.repository.PicklistItemRepository;
import com.monash.erp.wms.repository.PicklistRepository;
import com.monash.erp.wms.repository.PicklistStatusRepository;
import com.monash.erp.wms.repository.ShipmentItemRepository;
import com.monash.erp.wms.repository.ShipmentRepository;
import com.monash.erp.wms.repository.ShipmentRouteSegmentRepository;
import com.monash.erp.wms.repository.ShipmentStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SalesOrderFulfillmentService {

    private static final String DEFAULT_SHIP_GROUP = "00001";
    private static final String PICKLIST_STATUS_INPUT = "PICKLIST_INPUT";
    private static final String PICKITEM_STATUS_PENDING = "PICKITEM_PENDING";
    private static final String SHIPMENT_STATUS_INPUT = "SHIPMENT_INPUT";
    private static final String SHIPMENT_TYPE_SALES = "SALES_SHIPMENT";

    private final InventoryItemRepository inventoryItemRepository;
    private final InventoryItemDetailRepository inventoryItemDetailRepository;
    private final PicklistRepository picklistRepository;
    private final PicklistStatusRepository picklistStatusRepository;
    private final PicklistBinRepository picklistBinRepository;
    private final PicklistItemRepository picklistItemRepository;
    private final ShipmentRepository shipmentRepository;
    private final ShipmentStatusRepository shipmentStatusRepository;
    private final ShipmentItemRepository shipmentItemRepository;
    private final ShipmentRouteSegmentRepository shipmentRouteSegmentRepository;

    public SalesOrderFulfillmentService(
            InventoryItemRepository inventoryItemRepository,
            InventoryItemDetailRepository inventoryItemDetailRepository,
            PicklistRepository picklistRepository,
            PicklistStatusRepository picklistStatusRepository,
            PicklistBinRepository picklistBinRepository,
            PicklistItemRepository picklistItemRepository,
            ShipmentRepository shipmentRepository,
            ShipmentStatusRepository shipmentStatusRepository,
            ShipmentItemRepository shipmentItemRepository,
            ShipmentRouteSegmentRepository shipmentRouteSegmentRepository
    ) {
        this.inventoryItemRepository = inventoryItemRepository;
        this.inventoryItemDetailRepository = inventoryItemDetailRepository;
        this.picklistRepository = picklistRepository;
        this.picklistStatusRepository = picklistStatusRepository;
        this.picklistBinRepository = picklistBinRepository;
        this.picklistItemRepository = picklistItemRepository;
        this.shipmentRepository = shipmentRepository;
        this.shipmentStatusRepository = shipmentStatusRepository;
        this.shipmentItemRepository = shipmentItemRepository;
        this.shipmentRouteSegmentRepository = shipmentRouteSegmentRepository;
    }

    public InventoryReservationResponse reserveInventory(InventoryReservationRequest request) {
        if (request == null || request.getItems() == null || request.getItems().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "items are required");
        }
        if (isBlank(request.getFacilityId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "facilityId is required");
        }

        InventoryReservationResponse response = new InventoryReservationResponse();
        response.setOrderId(request.getOrderId());
        response.setFacilityId(request.getFacilityId());
        response.setShipGroupSeqId(defaultValue(request.getShipGroupSeqId(), DEFAULT_SHIP_GROUP));

        List<InventoryReservationItemResponse> itemResponses = new ArrayList<>();
        for (InventoryReservationItemRequest item : request.getItems()) {
            itemResponses.add(reserveItem(request, item));
        }
        response.setItems(itemResponses);
        return response;
    }

    public SalesOrderPicklistResponse createPicklist(SalesOrderPicklistRequest request) {
        if (request == null || request.getItems() == null || request.getItems().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "items are required");
        }
        if (isBlank(request.getOrderId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "orderId is required");
        }
        if (isBlank(request.getFacilityId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "facilityId is required");
        }

        Picklist picklist = new Picklist();
        picklist.setFacilityId(request.getFacilityId());
        picklist.setShipmentMethodTypeId(request.getShipmentMethodTypeId());
        picklist.setStatusId(PICKLIST_STATUS_INPUT);
        picklist.setPicklistDate(LocalDateTime.now());
        picklist.setCreatedDate(LocalDateTime.now());
        picklist.setLastModifiedDate(LocalDateTime.now());
        Picklist savedPicklist = picklistRepository.save(picklist);
        if (isBlank(savedPicklist.getPicklistId())) {
            savedPicklist.setPicklistId(String.valueOf(savedPicklist.getId()));
            savedPicklist = picklistRepository.save(savedPicklist);
        }
        String picklistId = savedPicklist.getPicklistId();

        PicklistStatus status = new PicklistStatus();
        status.setPicklistId(picklistId);
        status.setStatusId(PICKLIST_STATUS_INPUT);
        status.setStatusDate(LocalDateTime.now());
        picklistStatusRepository.save(status);

        PicklistBin bin = new PicklistBin();
        bin.setPicklistId(picklistId);
        bin.setPrimaryOrderId(request.getOrderId());
        bin.setPrimaryShipGroupSeqId(defaultValue(request.getShipGroupSeqId(), DEFAULT_SHIP_GROUP));
        bin.setBinLocationNumber("BIN-1");
        PicklistBin savedBin = picklistBinRepository.save(bin);
        if (isBlank(savedBin.getPicklistBinId())) {
            savedBin.setPicklistBinId(String.valueOf(savedBin.getId()));
            savedBin = picklistBinRepository.save(savedBin);
        }
        String picklistBinId = savedBin.getPicklistBinId();

        Shipment shipment = new Shipment();
        shipment.setShipmentTypeId(SHIPMENT_TYPE_SALES);
        shipment.setStatusId(SHIPMENT_STATUS_INPUT);
        shipment.setPrimaryOrderId(request.getOrderId());
        shipment.setPrimaryShipGroupSeqId(defaultValue(request.getShipGroupSeqId(), DEFAULT_SHIP_GROUP));
        shipment.setPicklistBinId(picklistBinId);
        shipment.setOriginFacilityId(request.getFacilityId());
        shipment.setCreatedDate(LocalDateTime.now());
        shipment.setLastModifiedDate(LocalDateTime.now());
        Shipment savedShipment = shipmentRepository.save(shipment);
        if (isBlank(savedShipment.getShipmentId())) {
            savedShipment.setShipmentId(String.valueOf(savedShipment.getId()));
            savedShipment = shipmentRepository.save(savedShipment);
        }
        String shipmentId = savedShipment.getShipmentId();

        ShipmentStatus shipmentStatus = new ShipmentStatus();
        shipmentStatus.setShipmentId(shipmentId);
        shipmentStatus.setStatusId(SHIPMENT_STATUS_INPUT);
        shipmentStatus.setStatusDate(LocalDateTime.now());
        shipmentStatusRepository.save(shipmentStatus);

        int seq = 1;
        for (SalesOrderPicklistItemRequest item : request.getItems()) {
            PicklistItem picklistItem = new PicklistItem();
            picklistItem.setPicklistBinId(picklistBinId);
            picklistItem.setOrderId(request.getOrderId());
            picklistItem.setOrderItemSeqId(item.getOrderItemSeqId());
            picklistItem.setShipGroupSeqId(defaultValue(request.getShipGroupSeqId(), DEFAULT_SHIP_GROUP));
            picklistItem.setInventoryItemId(item.getInventoryItemId());
            picklistItem.setItemStatusId(PICKITEM_STATUS_PENDING);
            picklistItem.setQuantity(toString(item.getQuantity()));
            picklistItemRepository.save(picklistItem);

            ShipmentItem shipmentItem = new ShipmentItem();
            shipmentItem.setShipmentId(shipmentId);
            shipmentItem.setShipmentItemSeqId(String.format("%05d", seq++));
            shipmentItem.setProductId(item.getProductId());
            shipmentItem.setQuantity(toString(item.getQuantity()));
            shipmentItemRepository.save(shipmentItem);
        }

        ShipmentRouteSegment segment = new ShipmentRouteSegment();
        segment.setShipmentId(shipmentId);
        segment.setShipmentRouteSegmentId("00001");
        segment.setOriginFacilityId(request.getFacilityId());
        segment.setShipmentMethodTypeId(request.getShipmentMethodTypeId());
        segment.setEstimatedStartDate(LocalDateTime.now());
        shipmentRouteSegmentRepository.save(segment);

        return new SalesOrderPicklistResponse(picklistId, picklistBinId, shipmentId);
    }

    private InventoryReservationItemResponse reserveItem(InventoryReservationRequest reservation, InventoryReservationItemRequest request) {
        if (request == null || isBlank(request.getProductId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "productId is required");
        }

        BigDecimal requested = defaultIfNull(request.getQuantity(), BigDecimal.ZERO);
        InventoryReservationItemResponse response = new InventoryReservationItemResponse();
        response.setOrderItemSeqId(request.getOrderItemSeqId());
        response.setProductId(request.getProductId());
        response.setRequestedQuantity(requested);

        if (requested.compareTo(BigDecimal.ZERO) <= 0) {
            response.setReservedQuantity(BigDecimal.ZERO);
            response.setNotAvailableQuantity(requested);
            response.setAllocations(List.of());
            return response;
        }

        List<InventoryItem> inventoryItems = inventoryItemRepository
                .findByProductIdAndFacilityId(request.getProductId(), reservation.getFacilityId()).stream()
                .filter(item -> toBigDecimal(item.getAvailableToPromiseTotal()).compareTo(BigDecimal.ZERO) > 0)
                .sorted(Comparator.comparing(InventoryItem::getId))
                .collect(Collectors.toList());

        BigDecimal remaining = requested;
        List<InventoryReservationAllocationDto> allocations = new ArrayList<>();
        for (InventoryItem item : inventoryItems) {
            if (remaining.compareTo(BigDecimal.ZERO) <= 0) {
                break;
            }
            BigDecimal available = toBigDecimal(item.getAvailableToPromiseTotal());
            if (available.compareTo(BigDecimal.ZERO) <= 0) {
                continue;
            }
            BigDecimal allocated = available.min(remaining);
            BigDecimal newAvailable = available.subtract(allocated);
            item.setAvailableToPromiseTotal(newAvailable.toPlainString());
            inventoryItemRepository.save(item);
            allocations.add(new InventoryReservationAllocationDto(item.getInventoryItemId(), allocated));
            createReservationDetail(reservation, request, item, allocated);
            remaining = remaining.subtract(allocated);
        }

        BigDecimal reserved = requested.subtract(remaining);
        response.setReservedQuantity(reserved);
        response.setNotAvailableQuantity(remaining);
        response.setAllocations(allocations);
        return response;
    }

    private void createReservationDetail(
            InventoryReservationRequest reservation,
            InventoryReservationItemRequest request,
            InventoryItem inventoryItem,
            BigDecimal allocated
    ) {
        InventoryItemDetail detail = new InventoryItemDetail();
        detail.setInventoryItemId(inventoryItem.getInventoryItemId());
        detail.setInventoryItemDetailSeqId("RSV-" + UUID.randomUUID().toString().replace("-", "").substring(0, 6).toUpperCase(Locale.ROOT));
        detail.setEffectiveDate(LocalDateTime.now());
        detail.setQuantityOnHandDiff("0");
        detail.setAvailableToPromiseDiff(allocated.negate().toPlainString());
        detail.setAccountingQuantityDiff("0");
        detail.setOrderId(reservation.getOrderId());
        detail.setOrderItemSeqId(request.getOrderItemSeqId());
        detail.setShipGroupSeqId(defaultValue(reservation.getShipGroupSeqId(), DEFAULT_SHIP_GROUP));
        detail.setDescription("Reserve inventory");
        inventoryItemDetailRepository.save(detail);
    }

    private String defaultValue(String value, String fallback) {
        return isBlank(value) ? fallback : value;
    }

    private String toString(BigDecimal value) {
        return value == null ? "0" : value.toPlainString();
    }

    private BigDecimal defaultIfNull(BigDecimal value, BigDecimal fallback) {
        return value == null ? fallback : value;
    }

    private BigDecimal toBigDecimal(String value) {
        if (value == null || value.isBlank()) {
            return BigDecimal.ZERO;
        }
        try {
            return new BigDecimal(value);
        } catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
