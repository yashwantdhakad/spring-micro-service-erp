package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductGeo;
import com.monash.erp.wms.repository.ProductGeoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductGeoService {

    private final ProductGeoRepository repository;

    public ProductGeoService(ProductGeoRepository repository) {
        this.repository = repository;
    }

    public List<ProductGeo> list() {
        return repository.findAll();
    }

    public ProductGeo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductGeo %d not found".formatted(id)));
    }

    public ProductGeo create(ProductGeo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductGeo update(Long id, ProductGeo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductGeo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}