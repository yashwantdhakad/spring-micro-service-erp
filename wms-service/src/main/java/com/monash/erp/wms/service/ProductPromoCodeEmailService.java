package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoCodeEmail;
import com.monash.erp.wms.repository.ProductPromoCodeEmailRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoCodeEmailService {

    private final ProductPromoCodeEmailRepository repository;

    public ProductPromoCodeEmailService(ProductPromoCodeEmailRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoCodeEmail> list() {
        return repository.findAll();
    }

    public ProductPromoCodeEmail get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCodeEmail %d not found".formatted(id)));
    }

    public ProductPromoCodeEmail create(ProductPromoCodeEmail entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoCodeEmail update(Long id, ProductPromoCodeEmail entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCodeEmail %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}