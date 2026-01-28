package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShoppingListType;
import com.monash.erp.wms.repository.ShoppingListTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShoppingListTypeService {

    private final ShoppingListTypeRepository repository;

    public ShoppingListTypeService(ShoppingListTypeRepository repository) {
        this.repository = repository;
    }

    public List<ShoppingListType> list() {
        return repository.findAll();
    }

    public ShoppingListType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingListType %d not found".formatted(id)));
    }

    public ShoppingListType create(ShoppingListType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShoppingListType update(Long id, ShoppingListType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingListType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}