package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductFeatureGroupAndAppl;
import com.example.erp.wms.ofbiz.repository.ProductFeatureGroupAndApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureGroupAndApplService {

    private final ProductFeatureGroupAndApplRepository repository;

    public ProductFeatureGroupAndApplService(ProductFeatureGroupAndApplRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureGroupAndAppl> list() {
        return repository.findAll();
    }

    public ProductFeatureGroupAndAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureGroupAndAppl %d not found".formatted(id)));
    }

    public ProductFeatureGroupAndAppl create(ProductFeatureGroupAndAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureGroupAndAppl update(Long id, ProductFeatureGroupAndAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureGroupAndAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}