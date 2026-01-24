package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.ShipmentCreateRequest;
import com.monash.erp.wms.dto.ShipmentDetailResponse;
import com.monash.erp.wms.dto.ShipmentListItem;
import com.monash.erp.wms.dto.ShipmentListResponse;
import com.monash.erp.wms.dto.ShipmentListResponseMap;
import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.entity.ShipmentItem;
import com.monash.erp.wms.entity.ShipmentPackage;
import com.monash.erp.wms.entity.ShipmentPackageContent;
import com.monash.erp.wms.entity.ShipmentPackageRouteSeg;
import com.monash.erp.wms.entity.ShipmentReceipt;
import com.monash.erp.wms.entity.ShipmentRouteSegment;
import com.monash.erp.wms.entity.ShipmentStatus;
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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
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

    public ShipmentCompositeService(
            ShipmentRepository shipmentRepository,
            ShipmentItemRepository shipmentItemRepository,
            ShipmentRouteSegmentRepository shipmentRouteSegmentRepository,
            ShipmentStatusRepository shipmentStatusRepository,
            ShipmentPackageRepository shipmentPackageRepository,
            ShipmentPackageContentRepository shipmentPackageContentRepository,
            ShipmentPackageRouteSegRepository shipmentPackageRouteSegRepository,
            ShipmentReceiptRepository shipmentReceiptRepository
    ) {
        this.shipmentRepository = shipmentRepository;
        this.shipmentItemRepository = shipmentItemRepository;
        this.shipmentRouteSegmentRepository = shipmentRouteSegmentRepository;
        this.shipmentStatusRepository = shipmentStatusRepository;
        this.shipmentPackageRepository = shipmentPackageRepository;
        this.shipmentPackageContentRepository = shipmentPackageContentRepository;
        this.shipmentPackageRouteSegRepository = shipmentPackageRouteSegRepository;
        this.shipmentReceiptRepository = shipmentReceiptRepository;
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
        if (isBlank(shipment.getShipmentId())) {
            shipment.setShipmentId(generateShipmentId());
        }

        LocalDateTime now = LocalDateTime.now();
        if (shipment.getCreatedDate() == null) {
            shipment.setCreatedDate(now);
        }
        shipment.setLastModifiedDate(now);
        shipment.setId(null);

        Shipment saved = shipmentRepository.save(shipment);

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

    private String generateShipmentId() {
        return "SHP-" + UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase(Locale.ROOT);
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
