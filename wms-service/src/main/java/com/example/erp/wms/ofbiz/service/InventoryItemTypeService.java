package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.InventoryItemType;
import com.example.erp.wms.ofbiz.repository.InventoryItemTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemTypeService {

    private final InventoryItemTypeRepository repository;

    public InventoryItemTypeService(InventoryItemTypeRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemType> list() {
        return repository.findAll();
    }

    public InventoryItemType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemType %d not found".formatted(id)));
    }

    public InventoryItemType create(InventoryItemType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemType update(Long id, InventoryItemType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}