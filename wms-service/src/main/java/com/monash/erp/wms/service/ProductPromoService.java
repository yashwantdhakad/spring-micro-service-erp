package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromo;
import com.monash.erp.wms.repository.ProductPromoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoService {

    private final ProductPromoRepository repository;

    public ProductPromoService(ProductPromoRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromo> list() {
        return repository.findAll();
    }

    public ProductPromo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromo %d not found".formatted(id)));
    }

    public ProductPromo create(ProductPromo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromo update(Long id, ProductPromo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}