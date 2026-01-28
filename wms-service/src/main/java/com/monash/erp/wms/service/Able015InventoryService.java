package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Able015Inventory;
import com.monash.erp.wms.repository.Able015InventoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class Able015InventoryService {

    private final Able015InventoryRepository repository;

    public Able015InventoryService(Able015InventoryRepository repository) {
        this.repository = repository;
    }

    public List<Able015Inventory> list() {
        return repository.findAll();
    }

    public Able015Inventory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Able015Inventory %d not found".formatted(id)));
    }

    public Able015Inventory create(Able015Inventory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Able015Inventory update(Long id, Able015Inventory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Able015Inventory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}