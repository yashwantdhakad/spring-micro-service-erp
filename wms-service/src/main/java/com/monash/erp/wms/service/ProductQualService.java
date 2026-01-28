package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductQual;
import com.monash.erp.wms.repository.ProductQualRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductQualService {

    private final ProductQualRepository repository;

    public ProductQualService(ProductQualRepository repository) {
        this.repository = repository;
    }

    public List<ProductQual> list() {
        return repository.findAll();
    }

    public ProductQual get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductQual %d not found".formatted(id)));
    }

    public ProductQual create(ProductQual entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductQual update(Long id, ProductQual entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductQual %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}