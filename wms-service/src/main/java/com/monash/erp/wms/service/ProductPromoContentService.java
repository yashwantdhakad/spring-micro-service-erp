package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoContent;
import com.monash.erp.wms.repository.ProductPromoContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoContentService {

    private final ProductPromoContentRepository repository;

    public ProductPromoContentService(ProductPromoContentRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoContent> list() {
        return repository.findAll();
    }

    public ProductPromoContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoContent %d not found".formatted(id)));
    }

    public ProductPromoContent create(ProductPromoContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoContent update(Long id, ProductPromoContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}