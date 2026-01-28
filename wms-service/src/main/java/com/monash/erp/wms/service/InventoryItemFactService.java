package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemFact;
import com.monash.erp.wms.repository.InventoryItemFactRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemFactService {

    private final InventoryItemFactRepository repository;

    public InventoryItemFactService(InventoryItemFactRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemFact> list() {
        return repository.findAll();
    }

    public InventoryItemFact get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemFact %d not found".formatted(id)));
    }

    public InventoryItemFact create(InventoryItemFact entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemFact update(Long id, InventoryItemFact entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemFact %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}