package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemLabelType;
import com.monash.erp.wms.repository.InventoryItemLabelTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemLabelTypeService {

    private final InventoryItemLabelTypeRepository repository;

    public InventoryItemLabelTypeService(InventoryItemLabelTypeRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemLabelType> list() {
        return repository.findAll();
    }

    public InventoryItemLabelType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemLabelType %d not found".formatted(id)));
    }

    public InventoryItemLabelType create(InventoryItemLabelType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemLabelType update(Long id, InventoryItemLabelType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemLabelType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}