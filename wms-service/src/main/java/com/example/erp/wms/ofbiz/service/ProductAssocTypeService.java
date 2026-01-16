package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductAssocType;
import com.example.erp.wms.ofbiz.repository.ProductAssocTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductAssocTypeService {

    private final ProductAssocTypeRepository repository;

    public ProductAssocTypeService(ProductAssocTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductAssocType> list() {
        return repository.findAll();
    }

    public ProductAssocType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAssocType %d not found".formatted(id)));
    }

    public ProductAssocType create(ProductAssocType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductAssocType update(Long id, ProductAssocType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAssocType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}