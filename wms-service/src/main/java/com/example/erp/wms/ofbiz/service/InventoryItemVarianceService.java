package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.InventoryItemVariance;
import com.example.erp.wms.ofbiz.repository.InventoryItemVarianceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemVarianceService {

    private final InventoryItemVarianceRepository repository;

    public InventoryItemVarianceService(InventoryItemVarianceRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemVariance> list() {
        return repository.findAll();
    }

    public InventoryItemVariance get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemVariance %d not found".formatted(id)));
    }

    public InventoryItemVariance create(InventoryItemVariance entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemVariance update(Long id, InventoryItemVariance entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemVariance %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}