package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductDimension;
import com.monash.erp.wms.repository.ProductDimensionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductDimensionService {

    private final ProductDimensionRepository repository;

    public ProductDimensionService(ProductDimensionRepository repository) {
        this.repository = repository;
    }

    public List<ProductDimension> list() {
        return repository.findAll();
    }

    public ProductDimension get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductDimension %d not found".formatted(id)));
    }

    public ProductDimension create(ProductDimension entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductDimension update(Long id, ProductDimension entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductDimension %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}