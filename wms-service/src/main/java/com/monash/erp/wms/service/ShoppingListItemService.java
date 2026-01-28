package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShoppingListItem;
import com.monash.erp.wms.repository.ShoppingListItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShoppingListItemService {

    private final ShoppingListItemRepository repository;

    public ShoppingListItemService(ShoppingListItemRepository repository) {
        this.repository = repository;
    }

    public List<ShoppingListItem> list() {
        return repository.findAll();
    }

    public ShoppingListItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingListItem %d not found".formatted(id)));
    }

    public ShoppingListItem create(ShoppingListItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShoppingListItem update(Long id, ShoppingListItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingListItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}