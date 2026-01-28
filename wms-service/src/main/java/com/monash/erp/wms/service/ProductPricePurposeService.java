package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPricePurpose;
import com.monash.erp.wms.repository.ProductPricePurposeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPricePurposeService {

    private final ProductPricePurposeRepository repository;

    public ProductPricePurposeService(ProductPricePurposeRepository repository) {
        this.repository = repository;
    }

    public List<ProductPricePurpose> list() {
        return repository.findAll();
    }

    public ProductPricePurpose get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPricePurpose %d not found".formatted(id)));
    }

    public ProductPricePurpose create(ProductPricePurpose entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPricePurpose update(Long id, ProductPricePurpose entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPricePurpose %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}