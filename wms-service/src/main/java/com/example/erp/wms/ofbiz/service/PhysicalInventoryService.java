package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.PhysicalInventory;
import com.example.erp.wms.ofbiz.repository.PhysicalInventoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PhysicalInventoryService {

    private final PhysicalInventoryRepository repository;

    public PhysicalInventoryService(PhysicalInventoryRepository repository) {
        this.repository = repository;
    }

    public List<PhysicalInventory> list() {
        return repository.findAll();
    }

    public PhysicalInventory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PhysicalInventory %d not found".formatted(id)));
    }

    public PhysicalInventory create(PhysicalInventory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PhysicalInventory update(Long id, PhysicalInventory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PhysicalInventory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}