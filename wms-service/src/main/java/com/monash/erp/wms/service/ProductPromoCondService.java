package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoCond;
import com.monash.erp.wms.repository.ProductPromoCondRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoCondService {

    private final ProductPromoCondRepository repository;

    public ProductPromoCondService(ProductPromoCondRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoCond> list() {
        return repository.findAll();
    }

    public ProductPromoCond get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCond %d not found".formatted(id)));
    }

    public ProductPromoCond create(ProductPromoCond entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoCond update(Long id, ProductPromoCond entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCond %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}