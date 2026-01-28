package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreKeywordOvrd;
import com.monash.erp.wms.repository.ProductStoreKeywordOvrdRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreKeywordOvrdService {

    private final ProductStoreKeywordOvrdRepository repository;

    public ProductStoreKeywordOvrdService(ProductStoreKeywordOvrdRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreKeywordOvrd> list() {
        return repository.findAll();
    }

    public ProductStoreKeywordOvrd get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreKeywordOvrd %d not found".formatted(id)));
    }

    public ProductStoreKeywordOvrd create(ProductStoreKeywordOvrd entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreKeywordOvrd update(Long id, ProductStoreKeywordOvrd entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreKeywordOvrd %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}