package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryCountVariance;
import com.monash.erp.wms.repository.InventoryCountVarianceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryCountVarianceService {

    private final InventoryCountVarianceRepository repository;

    public InventoryCountVarianceService(InventoryCountVarianceRepository repository) {
        this.repository = repository;
    }

    public List<InventoryCountVariance> list() {
        return repository.findAll();
    }

    public InventoryCountVariance get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryCountVariance %d not found".formatted(id)));
    }

    public InventoryCountVariance create(InventoryCountVariance entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryCountVariance update(Long id, InventoryCountVariance entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryCountVariance %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}