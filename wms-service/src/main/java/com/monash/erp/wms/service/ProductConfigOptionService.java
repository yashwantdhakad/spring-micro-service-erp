package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductConfigOption;
import com.monash.erp.wms.repository.ProductConfigOptionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductConfigOptionService {

    private final ProductConfigOptionRepository repository;

    public ProductConfigOptionService(ProductConfigOptionRepository repository) {
        this.repository = repository;
    }

    public List<ProductConfigOption> list() {
        return repository.findAll();
    }

    public ProductConfigOption get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigOption %d not found".formatted(id)));
    }

    public ProductConfigOption create(ProductConfigOption entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductConfigOption update(Long id, ProductConfigOption entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigOption %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}