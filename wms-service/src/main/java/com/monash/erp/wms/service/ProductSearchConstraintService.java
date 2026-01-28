package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductSearchConstraint;
import com.monash.erp.wms.repository.ProductSearchConstraintRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductSearchConstraintService {

    private final ProductSearchConstraintRepository repository;

    public ProductSearchConstraintService(ProductSearchConstraintRepository repository) {
        this.repository = repository;
    }

    public List<ProductSearchConstraint> list() {
        return repository.findAll();
    }

    public ProductSearchConstraint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductSearchConstraint %d not found".formatted(id)));
    }

    public ProductSearchConstraint create(ProductSearchConstraint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductSearchConstraint update(Long id, ProductSearchConstraint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductSearchConstraint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}