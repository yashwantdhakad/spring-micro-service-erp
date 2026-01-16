package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductStoreCatalog;
import com.example.erp.wms.ofbiz.repository.ProductStoreCatalogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreCatalogService {

    private final ProductStoreCatalogRepository repository;

    public ProductStoreCatalogService(ProductStoreCatalogRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreCatalog> list() {
        return repository.findAll();
    }

    public ProductStoreCatalog get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreCatalog %d not found".formatted(id)));
    }

    public ProductStoreCatalog create(ProductStoreCatalog entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreCatalog update(Long id, ProductStoreCatalog entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreCatalog %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}