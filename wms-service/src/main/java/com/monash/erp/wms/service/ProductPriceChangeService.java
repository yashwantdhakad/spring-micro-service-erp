package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPriceChange;
import com.monash.erp.wms.repository.ProductPriceChangeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPriceChangeService {

    private final ProductPriceChangeRepository repository;

    public ProductPriceChangeService(ProductPriceChangeRepository repository) {
        this.repository = repository;
    }

    public List<ProductPriceChange> list() {
        return repository.findAll();
    }

    public ProductPriceChange get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceChange %d not found".formatted(id)));
    }

    public ProductPriceChange create(ProductPriceChange entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPriceChange update(Long id, ProductPriceChange entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceChange %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}