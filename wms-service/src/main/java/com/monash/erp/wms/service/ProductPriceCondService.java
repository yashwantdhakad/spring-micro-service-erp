package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPriceCond;
import com.monash.erp.wms.repository.ProductPriceCondRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPriceCondService {

    private final ProductPriceCondRepository repository;

    public ProductPriceCondService(ProductPriceCondRepository repository) {
        this.repository = repository;
    }

    public List<ProductPriceCond> list() {
        return repository.findAll();
    }

    public ProductPriceCond get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceCond %d not found".formatted(id)));
    }

    public ProductPriceCond create(ProductPriceCond entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPriceCond update(Long id, ProductPriceCond entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceCond %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}