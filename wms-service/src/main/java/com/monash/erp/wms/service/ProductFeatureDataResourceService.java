package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeatureDataResource;
import com.monash.erp.wms.repository.ProductFeatureDataResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureDataResourceService {

    private final ProductFeatureDataResourceRepository repository;

    public ProductFeatureDataResourceService(ProductFeatureDataResourceRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureDataResource> list() {
        return repository.findAll();
    }

    public ProductFeatureDataResource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureDataResource %d not found".formatted(id)));
    }

    public ProductFeatureDataResource create(ProductFeatureDataResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureDataResource update(Long id, ProductFeatureDataResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureDataResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}