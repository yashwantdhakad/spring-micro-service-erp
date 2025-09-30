package com.example.erp.wms.service;

import com.example.erp.wms.domain.InventoryItem;
import com.example.erp.wms.domain.InventoryRepository;
import com.example.erp.wms.domain.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InventoryService {

    private final InventoryRepository repository;
    private final ProductRepository productRepository;

    public InventoryService(InventoryRepository repository, ProductRepository productRepository) {
        this.repository = repository;
        this.productRepository = productRepository;
    }

    public InventoryItem create(InventoryItem item) {
        productRepository.findBySku(item.getSku())
                .orElseThrow(() -> new IllegalArgumentException("Cannot add inventory for unknown SKU %s".formatted(item.getSku())));
        return repository.save(item);
    }

    public InventoryItem update(Long id, InventoryItem update) {
        return repository.findById(id)
                .map(existing -> {
                    productRepository.findBySku(update.getSku())
                            .orElseThrow(() -> new IllegalArgumentException("Cannot add inventory for unknown SKU %s".formatted(update.getSku())));
                    existing.setSku(update.getSku());
                    existing.setQuantityOnHand(update.getQuantityOnHand());
                    return repository.save(existing);
                })
                .orElseThrow(() -> new IllegalArgumentException("Inventory %d not found".formatted(id)));
    }

    @Transactional(readOnly = true)
    public List<InventoryItem> list() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public InventoryItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Inventory %d not found".formatted(id)));
    }

    @Transactional(readOnly = true)
    public InventoryItem getBySku(String sku) {
        return repository.findBySku(sku)
                .orElseThrow(() -> new IllegalArgumentException("Inventory for SKU %s not found".formatted(sku)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
