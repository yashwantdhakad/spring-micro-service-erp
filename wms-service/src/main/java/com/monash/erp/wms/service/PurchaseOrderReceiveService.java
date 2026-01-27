package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.PurchaseOrderReceiptDto;
import com.monash.erp.wms.dto.PurchaseOrderReceiveItemRequest;
import com.monash.erp.wms.dto.PurchaseOrderReceiveRequest;
import com.monash.erp.wms.dto.PurchaseOrderReceiveResponse;
import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.entity.InventoryItemDetail;
import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.entity.ShipmentItem;
import com.monash.erp.wms.entity.ShipmentReceipt;
import com.monash.erp.wms.entity.ShipmentStatus;
import com.monash.erp.wms.repository.InventoryItemDetailRepository;
import com.monash.erp.wms.repository.InventoryItemRepository;
import com.monash.erp.wms.repository.ShipmentItemRepository;
import com.monash.erp.wms.repository.ShipmentReceiptRepository;
import com.monash.erp.wms.repository.ShipmentRepository;
import com.monash.erp.wms.repository.ShipmentStatusRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Service
public class PurchaseOrderReceiveService {

    private static final String DEFAULT_INVENTORY_ITEM_TYPE = "NON_SERIAL_INV_ITEM";
    private static final String DEFAULT_CURRENCY = "USD";
    private static final String DEFAULT_OWNER_PARTY = "Company";
    private static final String SHIPMENT_TYPE = "PURCHASE_SHIPMENT";
    private static final String SHIPMENT_STATUS = "PURCH_SHIP_RECEIVED";

    private final ShipmentRepository shipmentRepository;
    private final ShipmentItemRepository shipmentItemRepository;
    private final ShipmentStatusRepository shipmentStatusRepository;
    private final InventoryItemRepository inventoryItemRepository;
    private final InventoryItemDetailRepository inventoryItemDetailRepository;
    private final ShipmentReceiptRepository shipmentReceiptRepository;
    private final RestTemplate restTemplate;
    private final String omsBaseUrl;

    public PurchaseOrderReceiveService(
            ShipmentRepository shipmentRepository,
            ShipmentItemRepository shipmentItemRepository,
            ShipmentStatusRepository shipmentStatusRepository,
            InventoryItemRepository inventoryItemRepository,
            InventoryItemDetailRepository inventoryItemDetailRepository,
            ShipmentReceiptRepository shipmentReceiptRepository,
            RestTemplate restTemplate,
            @Value("${oms.base-url}") String omsBaseUrl
    ) {
        this.shipmentRepository = shipmentRepository;
        this.shipmentItemRepository = shipmentItemRepository;
        this.shipmentStatusRepository = shipmentStatusRepository;
        this.inventoryItemRepository = inventoryItemRepository;
        this.inventoryItemDetailRepository = inventoryItemDetailRepository;
        this.shipmentReceiptRepository = shipmentReceiptRepository;
        this.restTemplate = restTemplate;
        this.omsBaseUrl = omsBaseUrl;
    }

    public PurchaseOrderReceiveResponse receive(String orderId, PurchaseOrderReceiveRequest request) {
        if (request == null || request.getItems() == null || request.getItems().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "items are required");
        }
        if (isBlank(request.getFacilityId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "facilityId is required");
        }

        String shipmentId = generateShipmentId();
        Shipment shipment = new Shipment();
        shipment.setShipmentId(shipmentId);
        shipment.setShipmentTypeId(SHIPMENT_TYPE);
        shipment.setStatusId(SHIPMENT_STATUS);
        shipment.setPrimaryOrderId(orderId);
        shipment.setPrimaryShipGroupSeqId(defaultValue(request.getShipGroupSeqId(), "00001"));
        shipment.setDestinationFacilityId(request.getFacilityId());
        shipment.setPartyIdFrom(request.getVendorPartyId());
        shipment.setCreatedDate(LocalDateTime.now());
        shipment.setLastModifiedDate(LocalDateTime.now());
        shipment.setId(null);
        shipmentRepository.save(shipment);

        ShipmentStatus status = new ShipmentStatus();
        status.setShipmentId(shipmentId);
        status.setStatusId(SHIPMENT_STATUS);
        status.setStatusDate(LocalDateTime.now());
        status.setId(null);
        shipmentStatusRepository.save(status);

        List<PurchaseOrderReceiptDto> receipts = new ArrayList<>();
        int seq = 1;
        for (PurchaseOrderReceiveItemRequest itemRequest : request.getItems()) {
            if (isBlank(itemRequest.getProductId())) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "productId is required");
            }
            if (isBlank(itemRequest.getQuantity())) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "quantity is required");
            }
            String shipmentItemSeqId = isBlank(itemRequest.getOrderItemSeqId())
                    ? String.format("%05d", seq++)
                    : itemRequest.getOrderItemSeqId();

            ShipmentItem shipmentItem = new ShipmentItem();
            shipmentItem.setShipmentId(shipmentId);
            shipmentItem.setShipmentItemSeqId(shipmentItemSeqId);
            shipmentItem.setProductId(itemRequest.getProductId());
            shipmentItem.setQuantity(itemRequest.getQuantity());
            shipmentItem.setId(null);
            shipmentItemRepository.save(shipmentItem);

            String inventoryItemId = generateInventoryItemId();
            InventoryItem inventoryItem = new InventoryItem();
            inventoryItem.setInventoryItemId(inventoryItemId);
            inventoryItem.setInventoryItemTypeId(DEFAULT_INVENTORY_ITEM_TYPE);
            inventoryItem.setProductId(itemRequest.getProductId());
            inventoryItem.setFacilityId(request.getFacilityId());
            inventoryItem.setOwnerPartyId(defaultValue(request.getOwnerPartyId(), DEFAULT_OWNER_PARTY));
            inventoryItem.setPartyId(request.getVendorPartyId());
            inventoryItem.setDatetimeReceived(defaultDate(request.getReceivedDate()));
            inventoryItem.setQuantityOnHandTotal(itemRequest.getQuantity());
            inventoryItem.setAvailableToPromiseTotal(itemRequest.getQuantity());
            inventoryItem.setAccountingQuantityTotal(itemRequest.getQuantity());
            inventoryItem.setUnitCost(itemRequest.getUnitCost());
            inventoryItem.setCurrencyUomId(defaultValue(request.getCurrencyUomId(), DEFAULT_CURRENCY));
            inventoryItem.setId(null);
            inventoryItemRepository.save(inventoryItem);

            ShipmentReceipt receipt = new ShipmentReceipt();
            receipt.setReceiptId(generateReceiptId());
            receipt.setInventoryItemId(inventoryItemId);
            receipt.setProductId(itemRequest.getProductId());
            receipt.setShipmentId(shipmentId);
            receipt.setShipmentItemSeqId(shipmentItemSeqId);
            receipt.setOrderId(orderId);
            receipt.setOrderItemSeqId(itemRequest.getOrderItemSeqId());
            receipt.setDatetimeReceived(defaultDate(request.getReceivedDate()));
            receipt.setQuantityAccepted(itemRequest.getQuantity());
            receipt.setQuantityRejected("0");
            receipt.setId(null);
            shipmentReceiptRepository.save(receipt);

            InventoryItemDetail detail = new InventoryItemDetail();
            detail.setInventoryItemId(inventoryItemId);
            detail.setInventoryItemDetailSeqId("00001");
            detail.setEffectiveDate(defaultDate(request.getReceivedDate()));
            detail.setQuantityOnHandDiff(itemRequest.getQuantity());
            detail.setAvailableToPromiseDiff(itemRequest.getQuantity());
            detail.setAccountingQuantityDiff(itemRequest.getQuantity());
            detail.setUnitCost(itemRequest.getUnitCost());
            detail.setOrderId(orderId);
            detail.setOrderItemSeqId(itemRequest.getOrderItemSeqId());
            detail.setShipGroupSeqId(defaultValue(request.getShipGroupSeqId(), "00001"));
            detail.setShipmentId(shipmentId);
            detail.setShipmentItemSeqId(shipmentItemSeqId);
            detail.setReceiptId(receipt.getReceiptId());
            detail.setId(null);
            inventoryItemDetailRepository.save(detail);

            receipts.add(new PurchaseOrderReceiptDto(
                    itemRequest.getOrderItemSeqId(),
                    receipt.getReceiptId(),
                    inventoryItemId,
                    itemRequest.getQuantity()
            ));
        }

        triggerBackorderReservation();
        return new PurchaseOrderReceiveResponse(shipmentId, receipts);
    }

    public List<ShipmentReceipt> listReceipts(String orderId) {
        return shipmentReceiptRepository.findByOrderId(orderId);
    }

    private String generateShipmentId() {
        return "SHP-" + UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase(Locale.ROOT);
    }

    private String generateInventoryItemId() {
        return "INV-" + UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase(Locale.ROOT);
    }

    private String generateReceiptId() {
        return "RCPT-" + UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase(Locale.ROOT);
    }

    private LocalDateTime defaultDate(LocalDateTime date) {
        return date == null ? LocalDateTime.now() : date;
    }

    private String defaultValue(String value, String fallback) {
        return isBlank(value) ? fallback : value;
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    private void triggerBackorderReservation() {
        try {
            String url = omsBaseUrl + "/api/orders/backorders/reserve";
            restTemplate.postForObject(url, null, Object.class);
        } catch (Exception ignored) {
        }
    }
}
