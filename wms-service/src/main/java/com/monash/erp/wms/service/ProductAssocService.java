package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductAssoc;
import com.monash.erp.wms.repository.ProductAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductAssocService {

    private final ProductAssocRepository repository;

    public ProductAssocService(ProductAssocRepository repository) {
        this.repository = repository;
    }

    public List<ProductAssoc> list() {
        return repository.findAll();
    }

    public ProductAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAssoc %d not found".formatted(id)));
    }

    public ProductAssoc create(ProductAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductAssoc update(Long id, ProductAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}