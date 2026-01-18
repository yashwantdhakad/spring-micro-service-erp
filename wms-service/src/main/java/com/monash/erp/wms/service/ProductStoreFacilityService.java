package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreFacility;
import com.monash.erp.wms.repository.ProductStoreFacilityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreFacilityService {

    private final ProductStoreFacilityRepository repository;

    public ProductStoreFacilityService(ProductStoreFacilityRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreFacility> list() {
        return repository.findAll();
    }

    public ProductStoreFacility get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreFacility %d not found".formatted(id)));
    }

    public ProductStoreFacility create(ProductStoreFacility entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreFacility update(Long id, ProductStoreFacility entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreFacility %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}