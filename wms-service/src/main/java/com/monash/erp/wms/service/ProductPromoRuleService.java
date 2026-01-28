package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoRule;
import com.monash.erp.wms.repository.ProductPromoRuleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoRuleService {

    private final ProductPromoRuleRepository repository;

    public ProductPromoRuleService(ProductPromoRuleRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoRule> list() {
        return repository.findAll();
    }

    public ProductPromoRule get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoRule %d not found".formatted(id)));
    }

    public ProductPromoRule create(ProductPromoRule entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoRule update(Long id, ProductPromoRule entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoRule %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}