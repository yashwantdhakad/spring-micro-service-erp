package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.PicklistOrderItemDto;
import com.monash.erp.wms.dto.PicklistOrderSummaryDto;
import com.monash.erp.wms.entity.Picklist;
import com.monash.erp.wms.entity.PicklistBin;
import com.monash.erp.wms.entity.PicklistItem;
import com.monash.erp.wms.entity.PicklistStatus;
import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.repository.PicklistBinRepository;
import com.monash.erp.wms.repository.PicklistItemRepository;
import com.monash.erp.wms.repository.PicklistRepository;
import com.monash.erp.wms.repository.PicklistStatusRepository;
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
import java.util.stream.Collectors;

@Service
public class PicklistOrderService {

    private static final String PICKLIST_STATUS_PICKED = "PICKLIST_PICKED";
    private static final String PICKITEM_STATUS_COMPLETED = "PICKITEM_COMPLETED";

    private final PicklistRepository picklistRepository;
    private final PicklistBinRepository picklistBinRepository;
    private final PicklistItemRepository picklistItemRepository;
    private final PicklistStatusRepository picklistStatusRepository;
    private final ShipmentRepository shipmentRepository;

    public PicklistOrderService(
            PicklistRepository picklistRepository,
            PicklistBinRepository picklistBinRepository,
            PicklistItemRepository picklistItemRepository,
            PicklistStatusRepository picklistStatusRepository,
            ShipmentRepository shipmentRepository
    ) {
        this.picklistRepository = picklistRepository;
        this.picklistBinRepository = picklistBinRepository;
        this.picklistItemRepository = picklistItemRepository;
        this.picklistStatusRepository = picklistStatusRepository;
        this.shipmentRepository = shipmentRepository;
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
                    .map(item -> new PicklistOrderItemDto(
                            item.getOrderItemSeqId(),
                            item.getInventoryItemId(),
                            item.getItemStatusId(),
                            toBigDecimal(item.getQuantity())
                    ))
                    .collect(Collectors.toList()));

            Shipment shipment = shipmentRepository.findByPicklistBinId(bin.getPicklistBinId()).orElse(null);
            if (shipment != null) {
                summary.setShipmentId(shipment.getShipmentId());
            }
            summaries.add(summary);
        }

        return summaries;
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
}
