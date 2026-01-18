package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.repository.InventoryItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemService {

    private final InventoryItemRepository repository;

    public InventoryItemService(InventoryItemRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItem> list() {
        return repository.findAll();
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
}