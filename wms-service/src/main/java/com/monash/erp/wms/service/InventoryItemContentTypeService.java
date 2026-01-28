package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemContentType;
import com.monash.erp.wms.repository.InventoryItemContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemContentTypeService {

    private final InventoryItemContentTypeRepository repository;

    public InventoryItemContentTypeService(InventoryItemContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemContentType> list() {
        return repository.findAll();
    }

    public InventoryItemContentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemContentType %d not found".formatted(id)));
    }

    public InventoryItemContentType create(InventoryItemContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemContentType update(Long id, InventoryItemContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}