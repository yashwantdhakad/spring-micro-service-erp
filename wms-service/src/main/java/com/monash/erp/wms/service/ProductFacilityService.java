package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFacility;
import com.monash.erp.wms.repository.ProductFacilityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFacilityService {

    private final ProductFacilityRepository repository;

    public ProductFacilityService(ProductFacilityRepository repository) {
        this.repository = repository;
    }

    public List<ProductFacility> list() {
        return repository.findAll();
    }

    public ProductFacility get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFacility %d not found".formatted(id)));
    }

    public ProductFacility create(ProductFacility entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFacility update(Long id, ProductFacility entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFacility %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}