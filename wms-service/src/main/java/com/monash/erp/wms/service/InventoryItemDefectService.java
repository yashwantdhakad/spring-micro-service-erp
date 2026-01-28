package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemDefect;
import com.monash.erp.wms.repository.InventoryItemDefectRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemDefectService {

    private final InventoryItemDefectRepository repository;

    public InventoryItemDefectService(InventoryItemDefectRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemDefect> list() {
        return repository.findAll();
    }

    public InventoryItemDefect get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemDefect %d not found".formatted(id)));
    }

    public InventoryItemDefect create(InventoryItemDefect entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemDefect update(Long id, InventoryItemDefect entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemDefect %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}