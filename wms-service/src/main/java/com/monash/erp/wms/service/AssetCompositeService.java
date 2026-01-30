package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.AssetDetailResponse;
import com.monash.erp.wms.dto.AssetListResponse;
import com.monash.erp.wms.dto.AssetListResponseMap;
import com.monash.erp.wms.dto.AssetReceiveRequest;
import com.monash.erp.wms.dto.AssetReceiveResponse;
import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.entity.InventoryItemDetail;
import com.monash.erp.wms.entity.ItemIssuance;
import com.monash.erp.wms.entity.ShipmentReceipt;
import com.monash.erp.wms.repository.InventoryItemDetailRepository;
import com.monash.erp.wms.repository.InventoryItemRepository;
import com.monash.erp.wms.repository.ItemIssuanceRepository;
import com.monash.erp.wms.repository.ShipmentReceiptRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;

@Service
public class AssetCompositeService {

    private static final String DEFAULT_INVENTORY_ITEM_TYPE = "NON_SERIAL_INV_ITEM";
    private static final String DEFAULT_CURRENCY = "USD";

    private final InventoryItemRepository inventoryItemRepository;
    private final InventoryItemDetailRepository inventoryItemDetailRepository;
    private final ShipmentReceiptRepository shipmentReceiptRepository;
    private final ItemIssuanceRepository itemIssuanceRepository;

    public AssetCompositeService(
            InventoryItemRepository inventoryItemRepository,
            InventoryItemDetailRepository inventoryItemDetailRepository,
            ShipmentReceiptRepository shipmentReceiptRepository,
            ItemIssuanceRepository itemIssuanceRepository
    ) {
        this.inventoryItemRepository = inventoryItemRepository;
        this.inventoryItemDetailRepository = inventoryItemDetailRepository;
        this.shipmentReceiptRepository = shipmentReceiptRepository;
        this.itemIssuanceRepository = itemIssuanceRepository;
    }

    public AssetListResponse listAssets(int page, int size, String queryString) {
        PageRequest pageable = PageRequest.of(Math.max(page, 0), Math.max(size, 1), Sort.by("id").descending());
        Page<InventoryItem> items;
        if (isBlank(queryString)) {
            items = inventoryItemRepository.findAll(pageable);
        } else {
            items = inventoryItemRepository
                    .findByInventoryItemIdContainingIgnoreCaseOrProductIdContainingIgnoreCase(queryString, queryString, pageable);
        }

        AssetListResponseMap responseMap = new AssetListResponseMap(items.getContent(), items.getTotalElements());
        return new AssetListResponse(responseMap);
    }

    public AssetDetailResponse getAsset(String assetId) {
        InventoryItem asset = findInventoryItem(assetId);
        String inventoryItemId = asset.getInventoryItemId();

        List<InventoryItemDetail> details = inventoryItemDetailRepository.findByInventoryItemId(inventoryItemId);
        List<ShipmentReceipt> receipts = shipmentReceiptRepository.findByInventoryItemId(inventoryItemId);
        List<ItemIssuance> issuances = itemIssuanceRepository.findByInventoryItemId(inventoryItemId);

        return new AssetDetailResponse(asset, details, receipts, issuances);
    }

    public AssetReceiveResponse receiveAsset(AssetReceiveRequest request) {
        if (request == null || isBlank(request.getProductId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "productId is required");
        }
        if (isBlank(request.getFacilityId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "facilityId is required");
        }
        if (isBlank(request.getQuantity())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "quantity is required");
        }
        if (isBlank(request.getAcquireCost())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "acquireCost is required");
        }

        String inventoryItemId = isBlank(request.getInventoryItemId())
                ? generateInventoryItemId()
                : request.getInventoryItemId();

        InventoryItem item = new InventoryItem();
        item.setInventoryItemId(inventoryItemId);
        item.setInventoryItemTypeId(defaultValue(request.getInventoryItemTypeId(), DEFAULT_INVENTORY_ITEM_TYPE));
        item.setProductId(request.getProductId());
        item.setStatusId(request.getStatusId());
        item.setFacilityId(request.getFacilityId());
        item.setLocationSeqId(request.getLocationSeqId());
        item.setOwnerPartyId(request.getVendorPartyId());
        item.setPartyId(request.getVendorPartyId());
        item.setDatetimeReceived(defaultDate(request.getReceivedDate()));
        item.setDatetimeManufactured(request.getManufacturedDate());
        item.setExpireDate(request.getExpirationDate());
        item.setQuantityOnHandTotal(request.getQuantity());
        item.setAvailableToPromiseTotal(request.getQuantity());
        item.setAccountingQuantityTotal(request.getQuantity());
        item.setUnitCost(request.getAcquireCost());
        item.setCurrencyUomId(defaultValue(request.getCurrencyUomId(), DEFAULT_CURRENCY));
        item.setComments(request.getComments());
        item.setId(null);

        InventoryItem savedItem = inventoryItemRepository.save(item);

        ShipmentReceipt receipt = new ShipmentReceipt();
        receipt.setReceiptId(generateReceiptId());
        receipt.setInventoryItemId(inventoryItemId);
        receipt.setProductId(request.getProductId());
        receipt.setShipmentId(request.getShipmentId());
        receipt.setOrderId(request.getOrderId());
        receipt.setOrderItemSeqId(request.getOrderItemSeqId());
        receipt.setDatetimeReceived(defaultDate(request.getReceivedDate()));
        receipt.setQuantityAccepted(request.getQuantity());
        receipt.setQuantityRejected("0");
        receipt.setId(null);

        ShipmentReceipt savedReceipt = shipmentReceiptRepository.save(receipt);

        ItemIssuance issuance = null;
        if (!isBlank(request.getShipmentId()) || !isBlank(request.getOrderId())) {
            issuance = new ItemIssuance();
            issuance.setItemIssuanceId(generateItemIssuanceId());
            issuance.setInventoryItemId(inventoryItemId);
            issuance.setShipmentId(request.getShipmentId());
            issuance.setShipmentItemSeqId(request.getShipmentItemSeqId());
            issuance.setOrderId(request.getOrderId());
            issuance.setOrderItemSeqId(request.getOrderItemSeqId());
            issuance.setShipGroupSeqId(request.getShipGroupSeqId());
            issuance.setIssuedDateTime(defaultDate(request.getReceivedDate()));
            issuance.setQuantity(request.getQuantity());
            issuance.setId(null);
            issuance = itemIssuanceRepository.save(issuance);
        }

        InventoryItemDetail detail = new InventoryItemDetail();
        detail.setInventoryItemId(inventoryItemId);
        detail.setInventoryItemDetailSeqId("00001");
        detail.setEffectiveDate(defaultDate(request.getReceivedDate()));
        detail.setQuantityOnHandDiff(request.getQuantity());
        detail.setAvailableToPromiseDiff(request.getQuantity());
        detail.setAccountingQuantityDiff(request.getQuantity());
        detail.setUnitCost(request.getAcquireCost());
        detail.setOrderId(request.getOrderId());
        detail.setOrderItemSeqId(request.getOrderItemSeqId());
        detail.setShipGroupSeqId(request.getShipGroupSeqId());
        detail.setShipmentId(request.getShipmentId());
        detail.setShipmentItemSeqId(request.getShipmentItemSeqId());
        detail.setReceiptId(savedReceipt.getReceiptId());
        detail.setItemIssuanceId(issuance == null ? null : issuance.getItemIssuanceId());
        detail.setWorkEffortId(request.getWorkEffortId());
        detail.setId(null);

        inventoryItemDetailRepository.save(detail);

        return new AssetReceiveResponse(savedItem.getInventoryItemId());
    }

    private InventoryItem findInventoryItem(String assetId) {
        Optional<InventoryItem> byInventoryItemId = inventoryItemRepository.findByInventoryItemId(assetId);
        if (byInventoryItemId.isPresent()) {
            return byInventoryItemId.get();
        }

        if (isNumeric(assetId)) {
            long id = Long.parseLong(assetId);
            return inventoryItemRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Asset %s not found".formatted(assetId)));
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Asset %s not found".formatted(assetId));
    }

    private String generateInventoryItemId() {
        return "INV-" + UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase(Locale.ROOT);
    }

    private String generateReceiptId() {
        return "RCPT-" + UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase(Locale.ROOT);
    }

    private String generateItemIssuanceId() {
        return "ISS-" + UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase(Locale.ROOT);
    }

    private String defaultValue(String value, String fallback) {
        return isBlank(value) ? fallback : value;
    }

    private LocalDateTime defaultDate(LocalDateTime date) {
        return date == null ? LocalDateTime.now() : date;
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    private boolean isNumeric(String value) {
        if (isBlank(value)) {
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
