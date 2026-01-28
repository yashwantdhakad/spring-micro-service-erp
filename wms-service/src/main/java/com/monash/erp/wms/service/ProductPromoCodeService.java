package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoCode;
import com.monash.erp.wms.repository.ProductPromoCodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoCodeService {

    private final ProductPromoCodeRepository repository;

    public ProductPromoCodeService(ProductPromoCodeRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoCode> list() {
        return repository.findAll();
    }

    public ProductPromoCode get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCode %d not found".formatted(id)));
    }

    public ProductPromoCode create(ProductPromoCode entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoCode update(Long id, ProductPromoCode entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCode %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}