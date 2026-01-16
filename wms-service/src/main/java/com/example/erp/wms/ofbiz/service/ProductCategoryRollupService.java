package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductCategoryRollup;
import com.example.erp.wms.ofbiz.repository.ProductCategoryRollupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryRollupService {

    private final ProductCategoryRollupRepository repository;

    public ProductCategoryRollupService(ProductCategoryRollupRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryRollup> list() {
        return repository.findAll();
    }

    public ProductCategoryRollup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryRollup %d not found".formatted(id)));
    }

    public ProductCategoryRollup create(ProductCategoryRollup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryRollup update(Long id, ProductCategoryRollup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryRollup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}