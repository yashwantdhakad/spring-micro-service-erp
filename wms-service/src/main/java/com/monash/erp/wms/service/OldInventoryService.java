package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.OldInventoryItem;
import com.monash.erp.wms.entity.OldInventoryRepository;
import com.monash.erp.wms.entity.OldProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OldInventoryService {

    private final OldInventoryRepository repository;
    private final OldProductRepository oldProductRepository;

    public OldInventoryService(OldInventoryRepository repository, OldProductRepository oldProductRepository) {
        this.repository = repository;
        this.oldProductRepository = oldProductRepository;
    }

    public OldInventoryItem create(OldInventoryItem item) {
        oldProductRepository.findBySku(item.getSku())
                .orElseThrow(() -> new IllegalArgumentException("Cannot add inventory for unknown SKU %s".formatted(item.getSku())));
        return repository.save(item);
    }

    public OldInventoryItem update(Long id, OldInventoryItem update) {
        return repository.findById(id)
                .map(existing -> {
                    oldProductRepository.findBySku(update.getSku())
                            .orElseThrow(() -> new IllegalArgumentException("Cannot add inventory for unknown SKU %s".formatted(update.getSku())));
                    existing.setSku(update.getSku());
                    existing.setQuantityOnHand(update.getQuantityOnHand());
                    return repository.save(existing);
                })
                .orElseThrow(() -> new IllegalArgumentException("Inventory %d not found".formatted(id)));
    }

    @Transactional(readOnly = true)
    public List<OldInventoryItem> list() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public OldInventoryItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Inventory %d not found".formatted(id)));
    }

    @Transactional(readOnly = true)
    public OldInventoryItem getBySku(String sku) {
        return repository.findBySku(sku)
                .orElseThrow(() -> new IllegalArgumentException("Inventory for SKU %s not found".formatted(sku)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
