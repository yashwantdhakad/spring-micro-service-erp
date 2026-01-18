package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeature;
import com.monash.erp.wms.repository.ProductFeatureRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureService {

    private final ProductFeatureRepository repository;

    public ProductFeatureService(ProductFeatureRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeature> list() {
        return repository.findAll();
    }

    public ProductFeature get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeature %d not found".formatted(id)));
    }

    public ProductFeature create(ProductFeature entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeature update(Long id, ProductFeature entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeature %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}