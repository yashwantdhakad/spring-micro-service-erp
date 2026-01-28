package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductConfigConfig;
import com.monash.erp.wms.repository.ProductConfigConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductConfigConfigService {

    private final ProductConfigConfigRepository repository;

    public ProductConfigConfigService(ProductConfigConfigRepository repository) {
        this.repository = repository;
    }

    public List<ProductConfigConfig> list() {
        return repository.findAll();
    }

    public ProductConfigConfig get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigConfig %d not found".formatted(id)));
    }

    public ProductConfigConfig create(ProductConfigConfig entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductConfigConfig update(Long id, ProductConfigConfig entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigConfig %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}