package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryAttribute;
import com.monash.erp.wms.repository.ProductCategoryAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryAttributeService {

    private final ProductCategoryAttributeRepository repository;

    public ProductCategoryAttributeService(ProductCategoryAttributeRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryAttribute> list() {
        return repository.findAll();
    }

    public ProductCategoryAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryAttribute %d not found".formatted(id)));
    }

    public ProductCategoryAttribute create(ProductCategoryAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryAttribute update(Long id, ProductCategoryAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}