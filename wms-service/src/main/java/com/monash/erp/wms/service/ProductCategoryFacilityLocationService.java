package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryFacilityLocation;
import com.monash.erp.wms.repository.ProductCategoryFacilityLocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryFacilityLocationService {

    private final ProductCategoryFacilityLocationRepository repository;

    public ProductCategoryFacilityLocationService(ProductCategoryFacilityLocationRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryFacilityLocation> list() {
        return repository.findAll();
    }

    public ProductCategoryFacilityLocation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryFacilityLocation %d not found".formatted(id)));
    }

    public ProductCategoryFacilityLocation create(ProductCategoryFacilityLocation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryFacilityLocation update(Long id, ProductCategoryFacilityLocation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryFacilityLocation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}