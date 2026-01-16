package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductType;
import com.example.erp.wms.ofbiz.repository.ProductTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductTypeService {

    private final ProductTypeRepository repository;

    public ProductTypeService(ProductTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductType> list() {
        return repository.findAll();
    }

    public ProductType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductType %d not found".formatted(id)));
    }

    public ProductType create(ProductType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductType update(Long id, ProductType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}