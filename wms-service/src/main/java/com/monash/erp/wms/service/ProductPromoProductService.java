package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoProduct;
import com.monash.erp.wms.repository.ProductPromoProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoProductService {

    private final ProductPromoProductRepository repository;

    public ProductPromoProductService(ProductPromoProductRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoProduct> list() {
        return repository.findAll();
    }

    public ProductPromoProduct get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoProduct %d not found".formatted(id)));
    }

    public ProductPromoProduct create(ProductPromoProduct entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoProduct update(Long id, ProductPromoProduct entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoProduct %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}