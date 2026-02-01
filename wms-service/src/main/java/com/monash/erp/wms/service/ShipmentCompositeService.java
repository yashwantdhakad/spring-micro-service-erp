package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.ShipmentCreateRequest;
import com.monash.erp.wms.dto.ShipmentDetailResponse;
import com.monash.erp.wms.dto.ShipmentListItem;
import com.monash.erp.wms.dto.ShipmentListResponse;
import com.monash.erp.wms.dto.ShipmentListResponseMap;
import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.entity.InventoryItemDetail;
import com.monash.erp.wms.entity.ItemIssuance;
import com.monash.erp.wms.entity.PicklistItem;
import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.entity.ShipmentItem;
import com.monash.erp.wms.entity.ShipmentPackage;
import com.monash.erp.wms.entity.ShipmentPackageContent;
import com.monash.erp.wms.entity.ShipmentPackageRouteSeg;
import com.monash.erp.wms.entity.ShipmentReceipt;
import com.monash.erp.wms.entity.ShipmentRouteSegment;
import com.monash.erp.wms.entity.ShipmentStatus;
import com.monash.erp.wms.repository.InventoryItemDetailRepository;
import com.monash.erp.wms.repository.InventoryItemRepository;
import com.monash.erp.wms.repository.ItemIssuanceRepository;
import com.monash.erp.wms.repository.PicklistItemRepository;
import com.monash.erp.wms.repository.ShipmentItemRepository;
import com.monash.erp.wms.repository.ShipmentPackageContentRepository;
import com.monash.erp.wms.repository.ShipmentPackageRepository;
import com.monash.erp.wms.repository.ShipmentPackageRouteSegRepository;
import com.monash.erp.wms.repository.ShipmentReceiptRepository;
import com.monash.erp.wms.repository.ShipmentRepository;
import com.monash.erp.wms.repository.ShipmentRouteSegmentRepository;
import com.monash.erp.wms.repository.ShipmentStatusRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShipmentCompositeService {

    private final ShipmentRepository shipmentRepository;
    private final ShipmentItemRepository shipmentItemRepository;
    private final ShipmentRouteSegmentRepository shipmentRouteSegmentRepository;
    private final ShipmentStatusRepository shipmentStatusRepository;
    private final ShipmentPackageRepository shipmentPackageRepository;
    private final ShipmentPackageContentRepository shipmentPackageContentRepository;
    private final ShipmentPackageRouteSegRepository shipmentPackageRouteSegRepository;
    private final ShipmentReceiptRepository shipmentReceiptRepository;
    private final InventoryItemRepository inventoryItemRepository;
    private final InventoryItemDetailRepository inventoryItemDetailRepository;
    private final ItemIssuanceRepository itemIssuanceRepository;
    private final PicklistItemRepository picklistItemRepository;
    private final RestTemplate restTemplate;
    private final String omsBaseUrl;

    public ShipmentCompositeService(
            ShipmentRepository shipmentRepository,
            ShipmentItemRepository shipmentItemRepository,
            ShipmentRouteSegmentRepository shipmentRouteSegmentRepository,
            ShipmentStatusRepository shipmentStatusRepository,
            ShipmentPackageRepository shipmentPackageRepository,
            ShipmentPackageContentRepository shipmentPackageContentRepository,
            ShipmentPackageRouteSegRepository shipmentPackageRouteSegRepository,
            ShipmentReceiptRepository shipmentReceiptRepository,
            InventoryItemRepository inventoryItemRepository,
            InventoryItemDetailRepository inventoryItemDetailRepository,
            ItemIssuanceRepository itemIssuanceRepository,
            PicklistItemRepository picklistItemRepository,
            RestTemplate restTemplate,
            @Value("${oms.base-url}") String omsBaseUrl
    ) {
        this.shipmentRepository = shipmentRepository;
        this.shipmentItemRepository = shipmentItemRepository;
        this.shipmentRouteSegmentRepository = shipmentRouteSegmentRepository;
        this.shipmentStatusRepository = shipmentStatusRepository;
        this.shipmentPackageRepository = shipmentPackageRepository;
        this.shipmentPackageContentRepository = shipmentPackageContentRepository;
        this.shipmentPackageRouteSegRepository = shipmentPackageRouteSegRepository;
        this.shipmentReceiptRepository = shipmentReceiptRepository;
        this.inventoryItemRepository = inventoryItemRepository;
        this.inventoryItemDetailRepository = inventoryItemDetailRepository;
        this.itemIssuanceRepository = itemIssuanceRepository;
        this.picklistItemRepository = picklistItemRepository;
        this.restTemplate = restTemplate;
        this.omsBaseUrl = omsBaseUrl;
    }

    public ShipmentListResponse listShipments(int page, int size, String queryString) {
        PageRequest pageable = PageRequest.of(Math.max(page, 0), Math.max(size, 1), Sort.by("id").descending());
        Page<Shipment> shipments;
        if (isBlank(queryString)) {
            shipments = shipmentRepository.findAll(pageable);
        } else {
            shipments = shipmentRepository
                    .findByShipmentIdContainingIgnoreCaseOrPrimaryOrderIdContainingIgnoreCase(queryString, queryString, pageable);
        }

        List<ShipmentListItem> items = shipments.getContent().stream()
                .map(this::toListItem)
                .collect(Collectors.toList());

        ShipmentListResponseMap responseMap = new ShipmentListResponseMap(items, shipments.getTotalElements());
        return new ShipmentListResponse(responseMap);
    }

    public List<ShipmentListItem> listShipmentsByOrder(String orderId) {
        if (isBlank(orderId)) {
            return List.of();
        }
        return shipmentRepository.findByPrimaryOrderId(orderId).stream()
                .sorted((left, right) -> {
                    if (left.getId() == null || right.getId() == null) {
                        return 0;
                    }
                    return right.getId().compareTo(left.getId());
                })
                .map(this::toListItem)
                .collect(Collectors.toList());
    }

    public ShipmentDetailResponse getShipment(String shipmentId) {
        Shipment shipment = findShipment(shipmentId);
        String lookupId = shipment.getShipmentId();

        List<ShipmentItem> items = shipmentItemRepository.findByShipmentId(lookupId);
        List<ShipmentRouteSegment> routeSegments = shipmentRouteSegmentRepository.findByShipmentId(lookupId);
        List<ShipmentStatus> statuses = shipmentStatusRepository.findByShipmentId(lookupId);
        List<ShipmentPackage> packages = shipmentPackageRepository.findByShipmentId(lookupId);
        List<ShipmentPackageContent> packageContents = shipmentPackageContentRepository.findByShipmentId(lookupId);
        List<ShipmentPackageRouteSeg> packageRouteSegments = shipmentPackageRouteSegRepository.findByShipmentId(lookupId);
        List<ShipmentReceipt> receipts = shipmentReceiptRepository.findByShipmentId(lookupId);

        return new ShipmentDetailResponse(
                shipment,
                items,
                routeSegments,
                statuses,
                packages,
                packageContents,
                packageRouteSegments,
                receipts
        );
    }

    public ShipmentDetailResponse createShipment(ShipmentCreateRequest request) {
        if (request == null || request.getShipment() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Shipment payload is required");
        }

        Shipment shipment = request.getShipment();
        LocalDateTime now = LocalDateTime.now();
        if (shipment.getCreatedDate() == null) {
            shipment.setCreatedDate(now);
        }
        shipment.setLastModifiedDate(now);
        shipment.setId(null);

        Shipment saved = shipmentRepository.save(shipment);
        if (isBlank(saved.getShipmentId())) {
            saved.setShipmentId(String.valueOf(saved.getId()));
            saved = shipmentRepository.save(saved);
        }

        List<ShipmentItem> items = saveItems(saved.getShipmentId(), request.getItems());
        List<ShipmentRouteSegment> routeSegments = saveRouteSegments(saved.getShipmentId(), request.getRouteSegments());
        List<ShipmentStatus> statuses = saveStatuses(saved.getShipmentId(), request.getStatuses(), saved.getStatusId());
        List<ShipmentPackage> packages = savePackages(saved.getShipmentId(), request.getPackages());
        List<ShipmentPackageContent> packageContents = savePackageContents(saved.getShipmentId(), request.getPackageContents());
        List<ShipmentPackageRouteSeg> packageRouteSegments = savePackageRouteSegments(saved.getShipmentId(), request.getPackageRouteSegments());

        return new ShipmentDetailResponse(
                saved,
                items,
                routeSegments,
                statuses,
                packages,
                packageContents,
                packageRouteSegments,
                Collections.emptyList()
        );
    }

    public ShipmentDetailResponse updateShipment(String shipmentId, ShipmentCreateRequest request) {
        Shipment existing = findShipment(shipmentId);
        if (request == null || request.getShipment() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Shipment payload is required");
        }

        Shipment incoming = request.getShipment();
        incoming.setId(existing.getId());
        incoming.setShipmentId(existing.getShipmentId());
        incoming.setCreatedDate(existing.getCreatedDate());
        incoming.setLastModifiedDate(LocalDateTime.now());

        Shipment saved = shipmentRepository.save(incoming);

        if (request.getItems() != null) {
            shipmentItemRepository.deleteByShipmentId(saved.getShipmentId());
        }
        if (request.getRouteSegments() != null) {
            shipmentRouteSegmentRepository.deleteByShipmentId(saved.getShipmentId());
        }
        if (request.getStatuses() != null) {
            shipmentStatusRepository.deleteByShipmentId(saved.getShipmentId());
        }
        if (request.getPackages() != null) {
            shipmentPackageRepository.deleteByShipmentId(saved.getShipmentId());
        }
        if (request.getPackageContents() != null) {
            shipmentPackageContentRepository.deleteByShipmentId(saved.getShipmentId());
        }
        if (request.getPackageRouteSegments() != null) {
            shipmentPackageRouteSegRepository.deleteByShipmentId(saved.getShipmentId());
        }

        List<ShipmentItem> items = saveItems(saved.getShipmentId(), request.getItems());
        List<ShipmentRouteSegment> routeSegments = saveRouteSegments(saved.getShipmentId(), request.getRouteSegments());
        List<ShipmentStatus> statuses = saveStatuses(saved.getShipmentId(), request.getStatuses(), saved.getStatusId());
        List<ShipmentPackage> packages = savePackages(saved.getShipmentId(), request.getPackages());
        List<ShipmentPackageContent> packageContents = savePackageContents(saved.getShipmentId(), request.getPackageContents());
        List<ShipmentPackageRouteSeg> packageRouteSegments = savePackageRouteSegments(saved.getShipmentId(), request.getPackageRouteSegments());
        List<ShipmentReceipt> receipts = shipmentReceiptRepository.findByShipmentId(saved.getShipmentId());

        return new ShipmentDetailResponse(
                saved,
                items,
                routeSegments,
                statuses,
                packages,
                packageContents,
                packageRouteSegments,
                receipts
        );
    }

    public ShipmentDetailResponse markShipped(String shipmentId) {
        Shipment shipment = findShipment(shipmentId);
        shipment.setStatusId("SHIPMENT_SHIPPED");
        shipment.setLastModifiedDate(LocalDateTime.now());
        Shipment saved = shipmentRepository.save(shipment);

        ShipmentStatus status = new ShipmentStatus();
        status.setShipmentId(saved.getShipmentId());
        status.setStatusId("SHIPMENT_SHIPPED");
        status.setStatusDate(LocalDateTime.now());
        shipmentStatusRepository.save(status);

        recordItemIssuances(saved);
        triggerSalesInvoice(saved.getPrimaryOrderId());
        clearReservations(saved.getPrimaryOrderId());
        completeSalesOrder(saved.getPrimaryOrderId());

        return getShipment(saved.getShipmentId());
    }

    public void deleteShipment(String shipmentId) {
        Shipment shipment = findShipment(shipmentId);
        shipmentItemRepository.deleteByShipmentId(shipment.getShipmentId());
        shipmentRouteSegmentRepository.deleteByShipmentId(shipment.getShipmentId());
        shipmentStatusRepository.deleteByShipmentId(shipment.getShipmentId());
        shipmentPackageRepository.deleteByShipmentId(shipment.getShipmentId());
        shipmentPackageContentRepository.deleteByShipmentId(shipment.getShipmentId());
        shipmentPackageRouteSegRepository.deleteByShipmentId(shipment.getShipmentId());
        shipmentReceiptRepository.deleteByShipmentId(shipment.getShipmentId());
        shipmentRepository.deleteById(shipment.getId());
    }

    private ShipmentListItem toListItem(Shipment shipment) {
        ShipmentListItem item = new ShipmentListItem();
        item.setShipmentId(shipment.getShipmentId());
        item.setShipmentTypeId(shipment.getShipmentTypeId());
        item.setStatusId(shipment.getStatusId());
        item.setPrimaryOrderId(shipment.getPrimaryOrderId());
        item.setOriginFacilityId(shipment.getOriginFacilityId());
        item.setDestinationFacilityId(shipment.getDestinationFacilityId());
        item.setEstimatedShipDate(shipment.getEstimatedShipDate());
        item.setCreatedDate(shipment.getCreatedDate());
        return item;
    }

    private Shipment findShipment(String shipmentId) {
        Optional<Shipment> byShipmentId = shipmentRepository.findByShipmentId(shipmentId);
        if (byShipmentId.isPresent()) {
            return byShipmentId.get();
        }

        if (isNumeric(shipmentId)) {
            long id = Long.parseLong(shipmentId);
            return shipmentRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment %s not found".formatted(shipmentId)));
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment %s not found".formatted(shipmentId));
    }

    private List<ShipmentItem> saveItems(String shipmentId, List<ShipmentItem> items) {
        if (items == null || items.isEmpty()) {
            return Collections.emptyList();
        }
        return items.stream()
                .map(item -> {
                    item.setId(null);
                    if (isBlank(item.getShipmentId())) {
                        item.setShipmentId(shipmentId);
                    }
                    return shipmentItemRepository.save(item);
                })
                .collect(Collectors.toList());
    }

    private List<ShipmentRouteSegment> saveRouteSegments(String shipmentId, List<ShipmentRouteSegment> segments) {
        if (segments == null || segments.isEmpty()) {
            return Collections.emptyList();
        }
        return segments.stream()
                .map(segment -> {
                    segment.setId(null);
                    if (isBlank(segment.getShipmentId())) {
                        segment.setShipmentId(shipmentId);
                    }
                    return shipmentRouteSegmentRepository.save(segment);
                })
                .collect(Collectors.toList());
    }

    private List<ShipmentStatus> saveStatuses(String shipmentId, List<ShipmentStatus> statuses, String fallbackStatusId) {
        if ((statuses == null || statuses.isEmpty()) && isBlank(fallbackStatusId)) {
            return Collections.emptyList();
        }

        List<ShipmentStatus> toSave = statuses == null || statuses.isEmpty()
                ? List.of(buildStatus(shipmentId, fallbackStatusId))
                : statuses;

        return toSave.stream()
                .map(status -> {
                    status.setId(null);
                    if (isBlank(status.getShipmentId())) {
                        status.setShipmentId(shipmentId);
                    }
                    if (status.getStatusDate() == null) {
                        status.setStatusDate(LocalDateTime.now());
                    }
                    return shipmentStatusRepository.save(status);
                })
                .collect(Collectors.toList());
    }

    private ShipmentStatus buildStatus(String shipmentId, String statusId) {
        ShipmentStatus status = new ShipmentStatus();
        status.setShipmentId(shipmentId);
        status.setStatusId(statusId);
        status.setStatusDate(LocalDateTime.now());
        return status;
    }

    private List<ShipmentPackage> savePackages(String shipmentId, List<ShipmentPackage> packages) {
        if (packages == null || packages.isEmpty()) {
            return Collections.emptyList();
        }
        return packages.stream()
                .map(pack -> {
                    pack.setId(null);
                    if (isBlank(pack.getShipmentId())) {
                        pack.setShipmentId(shipmentId);
                    }
                    return shipmentPackageRepository.save(pack);
                })
                .collect(Collectors.toList());
    }

    private List<ShipmentPackageContent> savePackageContents(String shipmentId, List<ShipmentPackageContent> contents) {
        if (contents == null || contents.isEmpty()) {
            return Collections.emptyList();
        }
        return contents.stream()
                .map(content -> {
                    content.setId(null);
                    if (isBlank(content.getShipmentId())) {
                        content.setShipmentId(shipmentId);
                    }
                    return shipmentPackageContentRepository.save(content);
                })
                .collect(Collectors.toList());
    }

    private List<ShipmentPackageRouteSeg> savePackageRouteSegments(String shipmentId, List<ShipmentPackageRouteSeg> routeSegs) {
        if (routeSegs == null || routeSegs.isEmpty()) {
            return Collections.emptyList();
        }
        return routeSegs.stream()
                .map(routeSeg -> {
                    routeSeg.setId(null);
                    if (isBlank(routeSeg.getShipmentId())) {
                        routeSeg.setShipmentId(shipmentId);
                    }
                    return shipmentPackageRouteSegRepository.save(routeSeg);
                })
                .collect(Collectors.toList());
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

    private void recordItemIssuances(Shipment shipment) {
        if (isBlank(shipment.getPicklistBinId())) {
            return;
        }

        List<PicklistItem> picklistItems = picklistItemRepository.findByPicklistBinId(shipment.getPicklistBinId());
        if (picklistItems.isEmpty()) {
            return;
        }

        List<ShipmentItem> shipmentItems = shipmentItemRepository.findByShipmentId(shipment.getShipmentId());
        Map<String, String> shipmentItemByProduct = new HashMap<>();
        for (ShipmentItem item : shipmentItems) {
            if (!isBlank(item.getProductId()) && !shipmentItemByProduct.containsKey(item.getProductId())) {
                shipmentItemByProduct.put(item.getProductId(), item.getShipmentItemSeqId());
            }
        }

        for (PicklistItem picklistItem : picklistItems) {
            InventoryItem inventoryItem = inventoryItemRepository.findByInventoryItemId(picklistItem.getInventoryItemId())
                    .orElse(null);
            if (inventoryItem == null) {
                continue;
            }

            String shipmentItemSeqId = shipmentItemByProduct.get(inventoryItem.getProductId());
            ItemIssuance issuance = new ItemIssuance();
            issuance.setInventoryItemId(inventoryItem.getInventoryItemId());
            issuance.setShipmentId(shipment.getShipmentId());
            issuance.setShipmentItemSeqId(shipmentItemSeqId);
            issuance.setOrderId(picklistItem.getOrderId());
            issuance.setOrderItemSeqId(picklistItem.getOrderItemSeqId());
            issuance.setShipGroupSeqId(picklistItem.getShipGroupSeqId());
            issuance.setIssuedDateTime(LocalDateTime.now());
            issuance.setQuantity(picklistItem.getQuantity());
            ItemIssuance savedIssuance = itemIssuanceRepository.save(issuance);
            if (isBlank(savedIssuance.getItemIssuanceId())) {
                savedIssuance.setItemIssuanceId(String.valueOf(savedIssuance.getId()));
                savedIssuance = itemIssuanceRepository.save(savedIssuance);
            }

            updateInventoryItemOnHand(inventoryItem, picklistItem.getQuantity());

            InventoryItemDetail detail = new InventoryItemDetail();
            detail.setInventoryItemId(inventoryItem.getInventoryItemId());
            detail.setEffectiveDate(LocalDateTime.now());
            detail.setQuantityOnHandDiff(negate(picklistItem.getQuantity()));
            detail.setAvailableToPromiseDiff("0");
            detail.setAccountingQuantityDiff(negate(picklistItem.getQuantity()));
            detail.setOrderId(picklistItem.getOrderId());
            detail.setOrderItemSeqId(picklistItem.getOrderItemSeqId());
            detail.setShipGroupSeqId(picklistItem.getShipGroupSeqId());
            detail.setShipmentId(shipment.getShipmentId());
            detail.setShipmentItemSeqId(shipmentItemSeqId);
            detail.setItemIssuanceId(savedIssuance.getItemIssuanceId());
            detail.setDescription("Ship order");
            InventoryItemDetail savedDetail = inventoryItemDetailRepository.save(detail);
            if (isBlank(savedDetail.getInventoryItemDetailSeqId())) {
                savedDetail.setInventoryItemDetailSeqId(String.valueOf(savedDetail.getId()));
                inventoryItemDetailRepository.save(savedDetail);
            }
        }
    }

    private void updateInventoryItemOnHand(InventoryItem inventoryItem, String quantity) {
        java.math.BigDecimal onHand = toBigDecimal(inventoryItem.getQuantityOnHandTotal());
        java.math.BigDecimal accounting = toBigDecimal(inventoryItem.getAccountingQuantityTotal());
        java.math.BigDecimal issued = toBigDecimal(quantity);
        inventoryItem.setQuantityOnHandTotal(onHand.subtract(issued).toPlainString());
        inventoryItem.setAccountingQuantityTotal(accounting.subtract(issued).toPlainString());
        inventoryItemRepository.save(inventoryItem);
    }

    private String negate(String value) {
        java.math.BigDecimal qty = toBigDecimal(value);
        return qty.negate().toPlainString();
    }

    private java.math.BigDecimal toBigDecimal(String value) {
        if (isBlank(value)) {
            return java.math.BigDecimal.ZERO;
        }
        try {
            return new java.math.BigDecimal(value);
        } catch (NumberFormatException e) {
            return java.math.BigDecimal.ZERO;
        }
    }

    private void triggerSalesInvoice(String orderId) {
        if (isBlank(orderId)) {
            return;
        }
        try {
            String url = omsBaseUrl + "/api/orders/" + orderId + "/invoice-sales";
            restTemplate.postForObject(url, null, Object.class);
        } catch (Exception ignored) {
        }
    }

    private void completeSalesOrder(String orderId) {
        if (isBlank(orderId)) {
            return;
        }
        try {
            String url = omsBaseUrl + "/api/orders/" + orderId + "/complete-sales";
            restTemplate.postForObject(url, null, Object.class);
        } catch (Exception ignored) {
        }
    }

    private void clearReservations(String orderId) {
        if (isBlank(orderId)) {
            return;
        }
        try {
            String url = omsBaseUrl + "/api/orders/" + orderId + "/reservations/clear";
            restTemplate.postForObject(url, null, Object.class);
        } catch (Exception ignored) {
        }
    }
}
