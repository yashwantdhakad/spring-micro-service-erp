package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoUse;
import com.monash.erp.wms.repository.ProductPromoUseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoUseService {

    private final ProductPromoUseRepository repository;

    public ProductPromoUseService(ProductPromoUseRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoUse> list() {
        return repository.findAll();
    }

    public ProductPromoUse get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoUse %d not found".formatted(id)));
    }

    public ProductPromoUse create(ProductPromoUse entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoUse update(Long id, ProductPromoUse entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoUse %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}