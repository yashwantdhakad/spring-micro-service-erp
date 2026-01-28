package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShoppingListItemSurvey;
import com.monash.erp.wms.repository.ShoppingListItemSurveyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShoppingListItemSurveyService {

    private final ShoppingListItemSurveyRepository repository;

    public ShoppingListItemSurveyService(ShoppingListItemSurveyRepository repository) {
        this.repository = repository;
    }

    public List<ShoppingListItemSurvey> list() {
        return repository.findAll();
    }

    public ShoppingListItemSurvey get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingListItemSurvey %d not found".formatted(id)));
    }

    public ShoppingListItemSurvey create(ShoppingListItemSurvey entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShoppingListItemSurvey update(Long id, ShoppingListItemSurvey entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShoppingListItemSurvey %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}