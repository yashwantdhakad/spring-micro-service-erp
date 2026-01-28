package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPriceRule;
import com.monash.erp.wms.repository.ProductPriceRuleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPriceRuleService {

    private final ProductPriceRuleRepository repository;

    public ProductPriceRuleService(ProductPriceRuleRepository repository) {
        this.repository = repository;
    }

    public List<ProductPriceRule> list() {
        return repository.findAll();
    }

    public ProductPriceRule get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceRule %d not found".formatted(id)));
    }

    public ProductPriceRule create(ProductPriceRule entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPriceRule update(Long id, ProductPriceRule entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceRule %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}