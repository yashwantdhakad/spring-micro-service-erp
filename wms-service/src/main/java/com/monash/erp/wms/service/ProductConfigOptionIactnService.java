package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductConfigOptionIactn;
import com.monash.erp.wms.repository.ProductConfigOptionIactnRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductConfigOptionIactnService {

    private final ProductConfigOptionIactnRepository repository;

    public ProductConfigOptionIactnService(ProductConfigOptionIactnRepository repository) {
        this.repository = repository;
    }

    public List<ProductConfigOptionIactn> list() {
        return repository.findAll();
    }

    public ProductConfigOptionIactn get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigOptionIactn %d not found".formatted(id)));
    }

    public ProductConfigOptionIactn create(ProductConfigOptionIactn entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductConfigOptionIactn update(Long id, ProductConfigOptionIactn entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigOptionIactn %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}