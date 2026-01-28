package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShoppingListWorkEffort;
import com.monash.erp.wms.repository.ShoppingListWorkEffortRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShoppingListWorkEffortService {

    private final ShoppingListWorkEffortRepository repository;

    public ShoppingListWorkEffortService(ShoppingListWorkEffortRepository repository) {
        this.repository = repository;
    }

    public List<ShoppingListWorkEffort> list() {
        return repository.findAll();
    }

    public ShoppingListWorkEffort get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingListWorkEffort %d not found".formatted(id)));
    }

    public ShoppingListWorkEffort create(ShoppingListWorkEffort entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShoppingListWorkEffort update(Long id, ShoppingListWorkEffort entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingListWorkEffort %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}