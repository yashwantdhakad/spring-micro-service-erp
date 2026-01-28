package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoAction;
import com.monash.erp.wms.repository.ProductPromoActionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoActionService {

    private final ProductPromoActionRepository repository;

    public ProductPromoActionService(ProductPromoActionRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoAction> list() {
        return repository.findAll();
    }

    public ProductPromoAction get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoAction %d not found".formatted(id)));
    }

    public ProductPromoAction create(ProductPromoAction entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoAction update(Long id, ProductPromoAction entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoAction %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}