package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemAttribute;
import com.monash.erp.wms.repository.InventoryItemAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemAttributeService {

    private final InventoryItemAttributeRepository repository;

    public InventoryItemAttributeService(InventoryItemAttributeRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemAttribute> list() {
        return repository.findAll();
    }

    public InventoryItemAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemAttribute %d not found".formatted(id)));
    }

    public InventoryItemAttribute create(InventoryItemAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemAttribute update(Long id, InventoryItemAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}