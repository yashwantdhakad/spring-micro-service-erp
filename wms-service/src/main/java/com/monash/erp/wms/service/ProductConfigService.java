package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductConfig;
import com.monash.erp.wms.repository.ProductConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductConfigService {

    private final ProductConfigRepository repository;

    public ProductConfigService(ProductConfigRepository repository) {
        this.repository = repository;
    }

    public List<ProductConfig> list() {
        return repository.findAll();
    }

    public ProductConfig get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfig %d not found".formatted(id)));
    }

    public ProductConfig create(ProductConfig entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductConfig update(Long id, ProductConfig entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfig %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}