package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPriceAction;
import com.monash.erp.wms.repository.ProductPriceActionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPriceActionService {

    private final ProductPriceActionRepository repository;

    public ProductPriceActionService(ProductPriceActionRepository repository) {
        this.repository = repository;
    }

    public List<ProductPriceAction> list() {
        return repository.findAll();
    }

    public ProductPriceAction get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceAction %d not found".formatted(id)));
    }

    public ProductPriceAction create(ProductPriceAction entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPriceAction update(Long id, ProductPriceAction entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceAction %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}