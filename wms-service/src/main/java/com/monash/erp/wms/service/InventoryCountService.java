package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryCount;
import com.monash.erp.wms.repository.InventoryCountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryCountService {

    private final InventoryCountRepository repository;

    public InventoryCountService(InventoryCountRepository repository) {
        this.repository = repository;
    }

    public List<InventoryCount> list() {
        return repository.findAll();
    }

    public InventoryCount get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryCount %d not found".formatted(id)));
    }

    public InventoryCount create(InventoryCount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryCount update(Long id, InventoryCount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryCount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}