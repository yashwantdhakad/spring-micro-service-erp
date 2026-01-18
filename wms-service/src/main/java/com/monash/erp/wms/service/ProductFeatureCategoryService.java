package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeatureCategory;
import com.monash.erp.wms.repository.ProductFeatureCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureCategoryService {

    private final ProductFeatureCategoryRepository repository;

    public ProductFeatureCategoryService(ProductFeatureCategoryRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureCategory> list() {
        return repository.findAll();
    }

    public ProductFeatureCategory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureCategory %d not found".formatted(id)));
    }

    public ProductFeatureCategory create(ProductFeatureCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureCategory update(Long id, ProductFeatureCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}