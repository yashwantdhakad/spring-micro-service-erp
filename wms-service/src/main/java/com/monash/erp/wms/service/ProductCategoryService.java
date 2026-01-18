package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategory;
import com.monash.erp.wms.repository.ProductCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryService {

    private final ProductCategoryRepository repository;

    public ProductCategoryService(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategory> list() {
        return repository.findAll();
    }

    public ProductCategory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategory %d not found".formatted(id)));
    }

    public ProductCategory create(ProductCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategory update(Long id, ProductCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}