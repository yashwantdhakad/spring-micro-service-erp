package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemKitHistory;
import com.monash.erp.wms.repository.InventoryItemKitHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemKitHistoryService {

    private final InventoryItemKitHistoryRepository repository;

    public InventoryItemKitHistoryService(InventoryItemKitHistoryRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemKitHistory> list() {
        return repository.findAll();
    }

    public InventoryItemKitHistory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemKitHistory %d not found".formatted(id)));
    }

    public InventoryItemKitHistory create(InventoryItemKitHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemKitHistory update(Long id, InventoryItemKitHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemKitHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}