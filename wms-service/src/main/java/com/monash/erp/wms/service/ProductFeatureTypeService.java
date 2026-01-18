package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeatureType;
import com.monash.erp.wms.repository.ProductFeatureTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureTypeService {

    private final ProductFeatureTypeRepository repository;

    public ProductFeatureTypeService(ProductFeatureTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureType> list() {
        return repository.findAll();
    }

    public ProductFeatureType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureType %d not found".formatted(id)));
    }

    public ProductFeatureType create(ProductFeatureType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureType update(Long id, ProductFeatureType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}