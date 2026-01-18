package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeatureApplType;
import com.monash.erp.wms.repository.ProductFeatureApplTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureApplTypeService {

    private final ProductFeatureApplTypeRepository repository;

    public ProductFeatureApplTypeService(ProductFeatureApplTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureApplType> list() {
        return repository.findAll();
    }

    public ProductFeatureApplType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureApplType %d not found".formatted(id)));
    }

    public ProductFeatureApplType create(ProductFeatureApplType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureApplType update(Long id, ProductFeatureApplType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureApplType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}