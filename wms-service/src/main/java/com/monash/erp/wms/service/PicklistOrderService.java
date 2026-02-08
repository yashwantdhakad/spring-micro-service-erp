package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.PicklistOrderItemDto;
import com.monash.erp.wms.dto.PicklistOrderGroupDto;
import com.monash.erp.wms.dto.PicklistOrderSummaryDto;
import com.monash.erp.wms.entity.Picklist;
import com.monash.erp.wms.entity.PicklistBin;
import com.monash.erp.wms.entity.PicklistItem;
import com.monash.erp.wms.entity.PicklistStatus;
import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.entity.Product;
import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.repository.InventoryItemRepository;
import com.monash.erp.wms.repository.PicklistBinRepository;
import com.monash.erp.wms.repository.PicklistItemRepository;
import com.monash.erp.wms.repository.PicklistRepository;
import com.monash.erp.wms.repository.PicklistStatusRepository;
import com.monash.erp.wms.repository.ProductRepository;
import com.monash.erp.wms.repository.ShipmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PicklistOrderService {

    private static final String PICKLIST_STATUS_PICKED = "PICKLIST_PICKED";
    private static final String PICKITEM_STATUS_COMPLETED = "PICKITEM_COMPLETED";
    private static final String DEFAULT_PICKLIST_STATUS = "PICKLIST_INPUT";

    private final PicklistRepository picklistRepository;
    private final PicklistBinRepository picklistBinRepository;
    private final PicklistItemRepository picklistItemRepository;
    private final PicklistStatusRepository picklistStatusRepository;
    private final ShipmentRepository shipmentRepository;
    private final InventoryItemRepository inventoryItemRepository;
    private final ProductRepository productRepository;

    public PicklistOrderService(
            PicklistRepository picklistRepository,
            PicklistBinRepository picklistBinRepository,
            PicklistItemRepository picklistItemRepository,
            PicklistStatusRepository picklistStatusRepository,
            ShipmentRepository shipmentRepository,
            InventoryItemRepository inventoryItemRepository,
            ProductRepository productRepository) {
        this.picklistRepository = picklistRepository;
        this.picklistBinRepository = picklistBinRepository;
        this.picklistItemRepository = picklistItemRepository;
        this.picklistStatusRepository = picklistStatusRepository;
        this.shipmentRepository = shipmentRepository;
        this.inventoryItemRepository = inventoryItemRepository;
        this.productRepository = productRepository;
    }

    public List<PicklistOrderSummaryDto> listByOrder(String orderId) {
        if (orderId == null || orderId.isBlank()) {
            return List.of();
        }

        List<PicklistBin> bins = picklistBinRepository.findByPrimaryOrderId(orderId);
        if (bins.isEmpty()) {
            return List.of();
        }

        List<String> picklistIds = bins.stream()
                .map(PicklistBin::getPicklistId)
                .distinct()
                .collect(Collectors.toList());

        Map<String, Picklist> picklists = picklistIds.stream()
                .map(picklistRepository::findByPicklistId)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toMap(Picklist::getPicklistId, picklist -> picklist));

        List<PicklistOrderSummaryDto> summaries = new ArrayList<>();
        List<PicklistItem> allItems = bins.stream()
                .map(PicklistBin::getPicklistBinId)
                .distinct()
                .flatMap(binId -> picklistItemRepository.findByPicklistBinId(binId).stream())
                .collect(Collectors.toList());

        Map<String, InventoryItem> inventoryItemMap = allItems.stream()
                .map(PicklistItem::getInventoryItemId)
                .filter(id -> id != null && !id.isBlank())
                .distinct()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        inventoryItemRepository::findByInventoryItemIdIn))
                .stream()
                .collect(Collectors.toMap(InventoryItem::getInventoryItemId, item -> item));

        Map<String, Product> productMap = inventoryItemMap.values().stream()
                .map(InventoryItem::getProductId)
                .filter(id -> id != null && !id.isBlank())
                .distinct()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        productRepository::findByProductIdIn))
                .stream()
                .collect(Collectors.toMap(Product::getProductId, product -> product));

        for (PicklistBin bin : bins) {
            Picklist picklist = picklists.get(bin.getPicklistId());
            if (picklist == null) {
                continue;
            }
            PicklistOrderSummaryDto summary = new PicklistOrderSummaryDto();
            summary.setPicklistId(picklist.getPicklistId());
            summary.setPicklistBinId(bin.getPicklistBinId());
            summary.setStatusId(picklist.getStatusId());
            summary.setCreatedDate(picklist.getCreatedDate());
            summary.setItems(picklistItemRepository.findByPicklistBinId(bin.getPicklistBinId()).stream()
                    .map(item -> {
                        InventoryItem inventoryItem = inventoryItemMap.get(item.getInventoryItemId());
                        String productId = inventoryItem != null ? inventoryItem.getProductId() : null;
                        Product product = productId != null ? productMap.get(productId) : null;
                        String productName = product != null ? product.getProductName() : null;
                        String location = inventoryItem != null ? resolveLocation(inventoryItem) : null;
                        String lotId = inventoryItem != null ? inventoryItem.getLotId() : null;
                        return new PicklistOrderItemDto(
                                item.getOrderItemSeqId(),
                                item.getInventoryItemId(),
                                item.getItemStatusId(),
                                toBigDecimal(item.getQuantity()),
                                productId,
                                productName,
                                location,
                                lotId);
                    })
                    .collect(Collectors.toList()));

            Shipment shipment = shipmentRepository.findByPicklistBinId(bin.getPicklistBinId()).orElse(null);
            if (shipment != null) {
                summary.setShipmentId(shipment.getShipmentId());
            }
            summaries.add(summary);
        }

        return summaries;
    }

    public List<PicklistOrderGroupDto> listReservedOrders(String statusId, String facilityId) {
        String resolvedStatus = (statusId == null || statusId.isBlank())
                ? DEFAULT_PICKLIST_STATUS
                : statusId;

        List<Picklist> picklists = (facilityId == null || facilityId.isBlank())
                ? picklistRepository.findByStatusId(resolvedStatus)
                : picklistRepository.findByStatusIdAndFacilityId(resolvedStatus, facilityId);

        if (picklists.isEmpty()) {
            return List.of();
        }

        Map<String, Picklist> picklistMap = picklists.stream()
                .collect(Collectors.toMap(Picklist::getPicklistId, picklist -> picklist));

        List<String> picklistIds = picklists.stream()
                .map(Picklist::getPicklistId)
                .distinct()
                .collect(Collectors.toList());

        List<PicklistBin> bins = picklistBinRepository.findByPicklistIdIn(picklistIds);
        if (bins.isEmpty()) {
            return List.of();
        }

        Map<String, List<PicklistBin>> binsByOrder = bins.stream()
                .filter(bin -> bin.getPrimaryOrderId() != null && !bin.getPrimaryOrderId().isBlank())
                .collect(Collectors.groupingBy(PicklistBin::getPrimaryOrderId));

        List<String> binIds = bins.stream()
                .map(PicklistBin::getPicklistBinId)
                .distinct()
                .collect(Collectors.toList());

        List<PicklistItem> items = picklistItemRepository.findByPicklistBinIdIn(binIds);
        Map<String, List<PicklistItem>> itemsByOrder = items.stream()
                .filter(item -> item.getOrderId() != null && !item.getOrderId().isBlank())
                .collect(Collectors.groupingBy(PicklistItem::getOrderId));

        List<PicklistOrderGroupDto> result = new ArrayList<>();
        for (Map.Entry<String, List<PicklistBin>> entry : binsByOrder.entrySet()) {
            String orderId = entry.getKey();
            List<PicklistBin> orderBins = entry.getValue();
            List<PicklistItem> orderItems = itemsByOrder.getOrDefault(orderId, List.of());

            PicklistBin firstBin = orderBins.get(0);
            Picklist picklist = picklistMap.get(firstBin.getPicklistId());
            if (picklist == null) {
                continue;
            }

            PicklistOrderGroupDto dto = new PicklistOrderGroupDto();
            dto.setOrderId(orderId);
            dto.setPicklistId(picklist.getPicklistId());
            dto.setFacilityId(picklist.getFacilityId());
            dto.setStatusId(picklist.getStatusId());
            dto.setCreatedDate(picklist.getCreatedDate());
            dto.setItemCount(orderItems.size());

            dto.setPickQuantity(orderItems.stream()
                    .map(item -> toBigDecimal(item.getQuantity()))
                    .reduce(BigDecimal.ZERO, BigDecimal::add));

            result.add(dto);
        }

        return result;
    }

    public PicklistOrderSummaryDto markPicked(String picklistId) {
        Picklist picklist = picklistRepository.findByPicklistId(picklistId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Picklist not found"));

        picklist.setStatusId(PICKLIST_STATUS_PICKED);
        picklistRepository.save(picklist);

        PicklistStatus status = new PicklistStatus();
        status.setPicklistId(picklistId);
        status.setStatusId(PICKLIST_STATUS_PICKED);
        status.setStatusDate(LocalDateTime.now());
        picklistStatusRepository.save(status);

        List<PicklistBin> bins = picklistBinRepository.findByPicklistId(picklistId);
        for (PicklistBin bin : bins) {
            List<PicklistItem> items = picklistItemRepository.findByPicklistBinId(bin.getPicklistBinId());
            for (PicklistItem item : items) {
                item.setItemStatusId(PICKITEM_STATUS_COMPLETED);
            }
            picklistItemRepository.saveAll(items);
        }

        PicklistOrderSummaryDto summary = new PicklistOrderSummaryDto();
        summary.setPicklistId(picklist.getPicklistId());
        summary.setStatusId(picklist.getStatusId());
        return summary;
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

    private String resolveLocation(InventoryItem inventoryItem) {
        if (inventoryItem == null) {
            return null;
        }
        if (inventoryItem.getLocationSeqId() != null && !inventoryItem.getLocationSeqId().isBlank()) {
            return inventoryItem.getLocationSeqId();
        }
        if (inventoryItem.getBinNumber() != null && !inventoryItem.getBinNumber().isBlank()) {
            return inventoryItem.getBinNumber();
        }
        return null;
    }

    public List<String> getOrdersInPicklists() {
        return picklistBinRepository.findAll().stream()
                .map(PicklistBin::getPrimaryOrderId)
                .filter(id -> id != null && !id.isBlank())
                .distinct()
                .collect(Collectors.toList());
    }
}
