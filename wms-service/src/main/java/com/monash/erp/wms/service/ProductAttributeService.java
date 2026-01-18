package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductAttribute;
import com.monash.erp.wms.repository.ProductAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductAttributeService {

    private final ProductAttributeRepository repository;

    public ProductAttributeService(ProductAttributeRepository repository) {
        this.repository = repository;
    }

    public List<ProductAttribute> list() {
        return repository.findAll();
    }

    public ProductAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAttribute %d not found".formatted(id)));
    }

    public ProductAttribute create(ProductAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductAttribute update(Long id, ProductAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}