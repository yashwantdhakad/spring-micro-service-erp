package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductConfigProduct;
import com.monash.erp.wms.repository.ProductConfigProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductConfigProductService {

    private final ProductConfigProductRepository repository;

    public ProductConfigProductService(ProductConfigProductRepository repository) {
        this.repository = repository;
    }

    public List<ProductConfigProduct> list() {
        return repository.findAll();
    }

    public ProductConfigProduct get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigProduct %d not found".formatted(id)));
    }

    public ProductConfigProduct create(ProductConfigProduct entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductConfigProduct update(Long id, ProductConfigProduct entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigProduct %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}