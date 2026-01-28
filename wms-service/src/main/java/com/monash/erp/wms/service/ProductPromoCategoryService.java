package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoCategory;
import com.monash.erp.wms.repository.ProductPromoCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoCategoryService {

    private final ProductPromoCategoryRepository repository;

    public ProductPromoCategoryService(ProductPromoCategoryRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoCategory> list() {
        return repository.findAll();
    }

    public ProductPromoCategory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCategory %d not found".formatted(id)));
    }

    public ProductPromoCategory create(ProductPromoCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoCategory update(Long id, ProductPromoCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}