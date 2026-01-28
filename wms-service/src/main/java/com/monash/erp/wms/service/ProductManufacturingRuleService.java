package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductManufacturingRule;
import com.monash.erp.wms.repository.ProductManufacturingRuleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductManufacturingRuleService {

    private final ProductManufacturingRuleRepository repository;

    public ProductManufacturingRuleService(ProductManufacturingRuleRepository repository) {
        this.repository = repository;
    }

    public List<ProductManufacturingRule> list() {
        return repository.findAll();
    }

    public ProductManufacturingRule get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductManufacturingRule %d not found".formatted(id)));
    }

    public ProductManufacturingRule create(ProductManufacturingRule entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductManufacturingRule update(Long id, ProductManufacturingRule entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductManufacturingRule %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}