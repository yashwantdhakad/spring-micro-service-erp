package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.InventorySummaryDto;
import com.monash.erp.wms.entity.Facility;
import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.repository.FacilityRepository;
import com.monash.erp.wms.repository.InventoryItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class InventoryItemService {

    private final InventoryItemRepository repository;
    private final FacilityRepository facilityRepository;

    public InventoryItemService(InventoryItemRepository repository, FacilityRepository facilityRepository) {
        this.repository = repository;
        this.facilityRepository = facilityRepository;
    }

    public List<InventoryItem> list() {
        return repository.findAll();
    }

    public List<InventorySummaryDto> summarizeByProduct(String productId) {
        List<InventoryItem> items = repository.findByProductId(productId);
        Map<String, Facility> facilityById = facilityRepository.findAll().stream()
                .collect(Collectors.toMap(Facility::getFacilityId, facility -> facility));
        Map<String, List<InventoryItem>> byFacility = items.stream()
                .filter(item -> item.getFacilityId() != null)
                .collect(Collectors.groupingBy(InventoryItem::getFacilityId));

        List<InventorySummaryDto> summaries = new ArrayList<>();
        for (Map.Entry<String, List<InventoryItem>> entry : byFacility.entrySet()) {
            String facilityId = entry.getKey();
            List<InventoryItem> facilityItems = entry.getValue();
            BigDecimal atpTotal = sumDecimal(facilityItems, InventoryItem::getAvailableToPromiseTotal);
            BigDecimal qohTotal = sumDecimal(facilityItems, InventoryItem::getQuantityOnHandTotal);
            String facilityName = facilityById.get(facilityId) != null
                    ? facilityById.get(facilityId).getFacilityName()
                    : null;
            summaries.add(new InventorySummaryDto(facilityId, facilityName, atpTotal, qohTotal));
        }
        return summaries;
    }

    public InventoryItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItem %d not found".formatted(id)));
    }

    public InventoryItem create(InventoryItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItem update(Long id, InventoryItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private BigDecimal sumDecimal(List<InventoryItem> items, java.util.function.Function<InventoryItem, String> mapper) {
        return items.stream()
                .map(mapper)
                .map(value -> {
                    try {
                        return new BigDecimal(value == null ? "0" : value);
                    } catch (NumberFormatException ex) {
                        return BigDecimal.ZERO;
                    }
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
