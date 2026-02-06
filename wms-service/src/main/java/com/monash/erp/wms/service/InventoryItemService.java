package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.InventorySummaryDto;
import com.monash.erp.wms.entity.Facility;
import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.entity.InventoryItemDetail;
import com.monash.erp.wms.repository.FacilityRepository;
import com.monash.erp.wms.repository.InventoryItemDetailRepository;
import com.monash.erp.wms.repository.InventoryItemRepository;
import com.monash.erp.wms.repository.PhysicalInventoryRepository;
import com.monash.erp.wms.repository.InventoryItemVarianceRepository;
import com.monash.erp.wms.entity.PhysicalInventory;
import com.monash.erp.wms.entity.InventoryItemVariance;
import com.monash.erp.wms.dto.PhysicalInventoryVarianceRequest;
import java.time.LocalDateTime;
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
    private final InventoryItemDetailRepository inventoryItemDetailRepository;
    private final PhysicalInventoryRepository physicalInventoryRepository;
    private final InventoryItemVarianceRepository inventoryItemVarianceRepository;

    public InventoryItemService(
            InventoryItemRepository repository,
            FacilityRepository facilityRepository,
            InventoryItemDetailRepository inventoryItemDetailRepository,
            PhysicalInventoryRepository physicalInventoryRepository,
            InventoryItemVarianceRepository inventoryItemVarianceRepository) {
        this.repository = repository;
        this.facilityRepository = facilityRepository;
        this.inventoryItemDetailRepository = inventoryItemDetailRepository;
        this.physicalInventoryRepository = physicalInventoryRepository;
        this.inventoryItemVarianceRepository = inventoryItemVarianceRepository;
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
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "InventoryItem %d not found".formatted(id)));
    }

    public InventoryItem getByInventoryItemId(String inventoryItemId) {
        return repository.findByInventoryItemId(inventoryItemId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "InventoryItem %s not found".formatted(inventoryItemId)));
    }

    public InventoryItem create(InventoryItem entity) {
        entity.setId(null);
        InventoryItem saved = repository.save(entity);
        if (isBlank(saved.getInventoryItemId())) {
            saved.setInventoryItemId(String.valueOf(saved.getId()));
            saved = repository.save(saved);
        }
        return saved;
    }

    public InventoryItem update(Long id, InventoryItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public List<InventoryItem> search(String productId, String facilityId) {
        if (isBlank(productId)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "productId is required");
        }
        if (isBlank(facilityId)) {
            return repository.findByProductId(productId);
        }
        return repository.findByProductIdAndFacilityId(productId, facilityId);
    }

    public InventoryItem recalculateTotals(String inventoryItemId) {
        InventoryItem item = getByInventoryItemId(inventoryItemId);
        List<InventoryItemDetail> details = inventoryItemDetailRepository.findByInventoryItemId(inventoryItemId);
        BigDecimal qohTotal = sumDetails(details, InventoryItemDetail::getQuantityOnHandDiff);
        BigDecimal atpTotal = sumDetails(details, InventoryItemDetail::getAvailableToPromiseDiff);
        BigDecimal accountingTotal = sumDetails(details, InventoryItemDetail::getAccountingQuantityDiff);
        item.setQuantityOnHandTotal(qohTotal.toPlainString());
        item.setAvailableToPromiseTotal(atpTotal.toPlainString());
        item.setAccountingQuantityTotal(accountingTotal.toPlainString());
        return repository.save(item);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private BigDecimal sumDetails(List<InventoryItemDetail> details,
            java.util.function.Function<InventoryItemDetail, String> mapper) {
        return details.stream()
                .map(mapper)
                .map(value -> {
                    try {
                        return new BigDecimal(value == null || value.isBlank() ? "0" : value);
                    } catch (NumberFormatException ex) {
                        return BigDecimal.ZERO;
                    }
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @org.springframework.transaction.annotation.Transactional
    public InventoryItemVariance createPhysicalInventoryVariance(Long inventoryItemId,
            PhysicalInventoryVarianceRequest request) {
        InventoryItem item = get(inventoryItemId);

        // 1. Create PhysicalInventory
        PhysicalInventory pi = new PhysicalInventory();
        pi.setPhysicalInventoryDate(LocalDateTime.now());
        pi.setGeneralComments(request.getComments());
        // Temporarily save to get ID if needed, or if ID is auto-generated
        PhysicalInventory savedPi = physicalInventoryRepository.save(pi);
        if (isBlank(savedPi.getPhysicalInventoryId())) {
            savedPi.setPhysicalInventoryId(String.valueOf(savedPi.getId()));
            savedPi = physicalInventoryRepository.save(savedPi);
        }

        // 2. Create InventoryItemVariance
        InventoryItemVariance iiv = new InventoryItemVariance();
        iiv.setInventoryItemId(item.getInventoryItemId());
        iiv.setPhysicalInventoryId(savedPi.getPhysicalInventoryId());
        iiv.setVarianceReasonId(request.getVarianceReasonId());
        iiv.setAvailableToPromiseVar(request.getAvailableToPromiseVar());
        iiv.setQuantityOnHandVar(request.getQuantityOnHandVar());
        iiv.setComments(request.getComments());
        InventoryItemVariance savedIiv = inventoryItemVarianceRepository.save(iiv);

        // 3. Create InventoryItemDetail
        InventoryItemDetail iid = new InventoryItemDetail();
        iid.setInventoryItemId(item.getInventoryItemId());
        iid.setPhysicalInventoryId(savedPi.getPhysicalInventoryId());
        iid.setEffectiveDate(LocalDateTime.now());
        iid.setQuantityOnHandDiff(request.getQuantityOnHandVar());
        iid.setAvailableToPromiseDiff(request.getAvailableToPromiseVar());
        iid.setReasonEnumId(request.getVarianceReasonId());
        iid.setDescription(request.getComments());
        // Note: You might want to set other fields like unitCost if available, or
        // accountingQuantityDiff
        inventoryItemDetailRepository.save(iid);

        // 4. Update Inventory Item Totals
        recalculateTotals(item.getInventoryItemId());

        return savedIiv;
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    private BigDecimal sumDecimal(List<InventoryItem> items,
            java.util.function.Function<InventoryItem, String> mapper) {
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
