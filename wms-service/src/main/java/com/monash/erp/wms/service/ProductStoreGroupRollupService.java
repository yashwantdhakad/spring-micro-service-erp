package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreGroupRollup;
import com.monash.erp.wms.repository.ProductStoreGroupRollupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreGroupRollupService {

    private final ProductStoreGroupRollupRepository repository;

    public ProductStoreGroupRollupService(ProductStoreGroupRollupRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreGroupRollup> list() {
        return repository.findAll();
    }

    public ProductStoreGroupRollup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroupRollup %d not found".formatted(id)));
    }

    public ProductStoreGroupRollup create(ProductStoreGroupRollup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreGroupRollup update(Long id, ProductStoreGroupRollup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroupRollup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}