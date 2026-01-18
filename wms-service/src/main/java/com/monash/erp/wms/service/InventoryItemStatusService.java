package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemStatus;
import com.monash.erp.wms.repository.InventoryItemStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemStatusService {

    private final InventoryItemStatusRepository repository;

    public InventoryItemStatusService(InventoryItemStatusRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemStatus> list() {
        return repository.findAll();
    }

    public InventoryItemStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemStatus %d not found".formatted(id)));
    }

    public InventoryItemStatus create(InventoryItemStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemStatus update(Long id, InventoryItemStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}