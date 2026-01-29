package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.PicklistBinDetailDto;
import com.monash.erp.wms.dto.PicklistDetailDto;
import com.monash.erp.wms.dto.PicklistItemDetailDto;
import com.monash.erp.wms.dto.PicklistSummaryDto;
import com.monash.erp.wms.entity.Picklist;
import com.monash.erp.wms.entity.PicklistBin;
import com.monash.erp.wms.entity.PicklistItem;
import com.monash.erp.wms.entity.PicklistRole;
import com.monash.erp.wms.repository.PicklistBinRepository;
import com.monash.erp.wms.repository.PicklistItemRepository;
import com.monash.erp.wms.repository.PicklistRepository;
import com.monash.erp.wms.repository.PicklistRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PicklistViewService {

    private final PicklistRepository picklistRepository;
    private final PicklistBinRepository picklistBinRepository;
    private final PicklistItemRepository picklistItemRepository;
    private final PicklistRoleRepository picklistRoleRepository;

    public PicklistViewService(
            PicklistRepository picklistRepository,
            PicklistBinRepository picklistBinRepository,
            PicklistItemRepository picklistItemRepository,
            PicklistRoleRepository picklistRoleRepository
    ) {
        this.picklistRepository = picklistRepository;
        this.picklistBinRepository = picklistBinRepository;
        this.picklistItemRepository = picklistItemRepository;
        this.picklistRoleRepository = picklistRoleRepository;
    }

    public List<PicklistSummaryDto> listSummaries(String facilityId, String statusId, LocalDate fromDate, LocalDate toDate) {
        List<Picklist> picklists = picklistRepository.findAll();

        List<Picklist> filtered = picklists.stream()
                .filter(picklist -> matchesFacility(picklist, facilityId))
                .filter(picklist -> matchesStatus(picklist, statusId))
                .filter(picklist -> matchesDate(picklist, fromDate, toDate))
                .sorted(Comparator.comparing(Picklist::getCreatedDate, Comparator.nullsLast(Comparator.reverseOrder())))
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            return List.of();
        }

        List<String> picklistIds = filtered.stream()
                .map(Picklist::getPicklistId)
                .filter(this::isNotBlank)
                .distinct()
                .collect(Collectors.toList());

        List<PicklistBin> bins = picklistIds.isEmpty()
                ? List.of()
                : picklistBinRepository.findByPicklistIdIn(picklistIds);

        Map<String, List<PicklistBin>> binsByPicklist = bins.stream()
                .collect(Collectors.groupingBy(PicklistBin::getPicklistId));

        List<String> binIds = bins.stream()
                .map(PicklistBin::getPicklistBinId)
                .filter(this::isNotBlank)
                .distinct()
                .collect(Collectors.toList());

        List<PicklistItem> items = binIds.isEmpty()
                ? List.of()
                : picklistItemRepository.findByPicklistBinIdIn(binIds);

        Map<String, List<PicklistItem>> itemsByBin = items.stream()
                .collect(Collectors.groupingBy(PicklistItem::getPicklistBinId));

        Map<String, String> pickerByPicklist = picklistRoleRepository.findByPicklistIdIn(picklistIds).stream()
                .collect(Collectors.groupingBy(PicklistRole::getPicklistId))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> resolvePicker(entry.getValue())
                ));

        List<PicklistSummaryDto> summaries = new ArrayList<>();
        for (Picklist picklist : filtered) {
            PicklistSummaryDto summary = new PicklistSummaryDto();
            summary.setPicklistId(picklist.getPicklistId());
            summary.setFacilityId(picklist.getFacilityId());
            summary.setStatusId(picklist.getStatusId());
            summary.setCreatedDate(picklist.getCreatedDate());
            summary.setPickerId(pickerByPicklist.get(picklist.getPicklistId()));

            List<PicklistBin> picklistBins = binsByPicklist.getOrDefault(picklist.getPicklistId(), List.of());
            summary.setOrderCount((int) picklistBins.stream()
                    .map(PicklistBin::getPrimaryOrderId)
                    .filter(this::isNotBlank)
                    .distinct()
                    .count());

            int itemCount = 0;
            for (PicklistBin bin : picklistBins) {
                itemCount += itemsByBin.getOrDefault(bin.getPicklistBinId(), List.of()).size();
            }
            summary.setItemCount(itemCount);
            summaries.add(summary);
        }

        return summaries;
    }

    public PicklistDetailDto getDetail(String picklistId) {
        if (isBlank(picklistId)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "picklistId is required");
        }

        Picklist picklist = picklistRepository.findByPicklistId(picklistId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Picklist not found"));

        List<PicklistBin> bins = picklistBinRepository.findByPicklistId(picklistId);
        List<String> binIds = bins.stream()
                .map(PicklistBin::getPicklistBinId)
                .filter(this::isNotBlank)
                .distinct()
                .collect(Collectors.toList());

        List<PicklistItem> items = binIds.isEmpty()
                ? List.of()
                : picklistItemRepository.findByPicklistBinIdIn(binIds);

        Map<String, List<PicklistItem>> itemsByBin = items.stream()
                .collect(Collectors.groupingBy(PicklistItem::getPicklistBinId));

        PicklistDetailDto detail = new PicklistDetailDto();
        detail.setPicklist(picklist);
        detail.setPickerId(resolvePicker(picklistRoleRepository.findByPicklistIdIn(List.of(picklistId))));

        List<PicklistBinDetailDto> binDetails = new ArrayList<>();
        for (PicklistBin bin : bins) {
            PicklistBinDetailDto binDetail = new PicklistBinDetailDto();
            binDetail.setPicklistBinId(bin.getPicklistBinId());
            binDetail.setBinLocationNumber(bin.getBinLocationNumber());
            binDetail.setPrimaryOrderId(bin.getPrimaryOrderId());
            binDetail.setPrimaryShipGroupSeqId(bin.getPrimaryShipGroupSeqId());
            binDetail.setItems(itemsByBin.getOrDefault(bin.getPicklistBinId(), List.of()).stream()
                    .map(this::toItemDetail)
                    .collect(Collectors.toList()));
            binDetails.add(binDetail);
        }

        detail.setBins(binDetails);
        return detail;
    }

    private PicklistItemDetailDto toItemDetail(PicklistItem item) {
        PicklistItemDetailDto dto = new PicklistItemDetailDto();
        dto.setOrderId(item.getOrderId());
        dto.setOrderItemSeqId(item.getOrderItemSeqId());
        dto.setShipGroupSeqId(item.getShipGroupSeqId());
        dto.setInventoryItemId(item.getInventoryItemId());
        dto.setItemStatusId(item.getItemStatusId());
        dto.setQuantity(toBigDecimal(item.getQuantity()));
        return dto;
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

    private boolean matchesFacility(Picklist picklist, String facilityId) {
        return isBlank(facilityId) || facilityId.equals(picklist.getFacilityId());
    }

    private boolean matchesStatus(Picklist picklist, String statusId) {
        return isBlank(statusId) || statusId.equals(picklist.getStatusId());
    }

    private boolean matchesDate(Picklist picklist, LocalDate fromDate, LocalDate toDate) {
        if (picklist.getCreatedDate() == null) {
            return fromDate == null && toDate == null;
        }
        LocalDate created = picklist.getCreatedDate().toLocalDate();
        if (fromDate != null && created.isBefore(fromDate)) {
            return false;
        }
        if (toDate != null && created.isAfter(toDate)) {
            return false;
        }
        return true;
    }

    private String resolvePicker(List<PicklistRole> roles) {
        if (roles == null || roles.isEmpty()) {
            return null;
        }
        Optional<PicklistRole> activePicker = roles.stream()
                .filter(role -> "PICKER".equalsIgnoreCase(role.getRoleTypeId()))
                .filter(role -> role.getThruDate() == null)
                .findFirst();
        if (activePicker.isPresent()) {
            return activePicker.get().getPartyId();
        }
        Optional<PicklistRole> anyPicker = roles.stream()
                .filter(role -> "PICKER".equalsIgnoreCase(role.getRoleTypeId()))
                .findFirst();
        return anyPicker.orElse(roles.get(0)).getPartyId();
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    private boolean isNotBlank(String value) {
        return value != null && !value.isBlank();
    }
}
