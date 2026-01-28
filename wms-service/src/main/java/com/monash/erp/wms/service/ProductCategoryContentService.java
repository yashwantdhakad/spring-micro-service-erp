package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryContent;
import com.monash.erp.wms.repository.ProductCategoryContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryContentService {

    private final ProductCategoryContentRepository repository;

    public ProductCategoryContentService(ProductCategoryContentRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryContent> list() {
        return repository.findAll();
    }

    public ProductCategoryContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryContent %d not found".formatted(id)));
    }

    public ProductCategoryContent create(ProductCategoryContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryContent update(Long id, ProductCategoryContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}