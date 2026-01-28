package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShoppingList;
import com.monash.erp.wms.repository.ShoppingListRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShoppingListService {

    private final ShoppingListRepository repository;

    public ShoppingListService(ShoppingListRepository repository) {
        this.repository = repository;
    }

    public List<ShoppingList> list() {
        return repository.findAll();
    }

    public ShoppingList get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingList %d not found".formatted(id)));
    }

    public ShoppingList create(ShoppingList entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShoppingList update(Long id, ShoppingList entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingList %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}