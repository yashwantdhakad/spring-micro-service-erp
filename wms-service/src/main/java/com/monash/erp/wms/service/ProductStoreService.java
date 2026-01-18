package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStore;
import com.monash.erp.wms.repository.ProductStoreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreService {

    private final ProductStoreRepository repository;

    public ProductStoreService(ProductStoreRepository repository) {
        this.repository = repository;
    }

    public List<ProductStore> list() {
        return repository.findAll();
    }

    public ProductStore get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStore %d not found".formatted(id)));
    }

    public ProductStore create(ProductStore entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStore update(Long id, ProductStore entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStore %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}