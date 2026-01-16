package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductFeatureAppl;
import com.example.erp.wms.ofbiz.repository.ProductFeatureApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureApplService {

    private final ProductFeatureApplRepository repository;

    public ProductFeatureApplService(ProductFeatureApplRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureAppl> list() {
        return repository.findAll();
    }

    public ProductFeatureAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureAppl %d not found".formatted(id)));
    }

    public ProductFeatureAppl create(ProductFeatureAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureAppl update(Long id, ProductFeatureAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}