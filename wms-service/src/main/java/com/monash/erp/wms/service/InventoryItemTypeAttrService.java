package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemTypeAttr;
import com.monash.erp.wms.repository.InventoryItemTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemTypeAttrService {

    private final InventoryItemTypeAttrRepository repository;

    public InventoryItemTypeAttrService(InventoryItemTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemTypeAttr> list() {
        return repository.findAll();
    }

    public InventoryItemTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemTypeAttr %d not found".formatted(id)));
    }

    public InventoryItemTypeAttr create(InventoryItemTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemTypeAttr update(Long id, InventoryItemTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}