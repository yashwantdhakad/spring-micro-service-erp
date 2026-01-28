package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemContent;
import com.monash.erp.wms.repository.InventoryItemContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemContentService {

    private final InventoryItemContentRepository repository;

    public InventoryItemContentService(InventoryItemContentRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemContent> list() {
        return repository.findAll();
    }

    public InventoryItemContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemContent %d not found".formatted(id)));
    }

    public InventoryItemContent create(InventoryItemContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemContent update(Long id, InventoryItemContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}