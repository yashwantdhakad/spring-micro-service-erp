package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreGroup;
import com.monash.erp.wms.repository.ProductStoreGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreGroupService {

    private final ProductStoreGroupRepository repository;

    public ProductStoreGroupService(ProductStoreGroupRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreGroup> list() {
        return repository.findAll();
    }

    public ProductStoreGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroup %d not found".formatted(id)));
    }

    public ProductStoreGroup create(ProductStoreGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreGroup update(Long id, ProductStoreGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}