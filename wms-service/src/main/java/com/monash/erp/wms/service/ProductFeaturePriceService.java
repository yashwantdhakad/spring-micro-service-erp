package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeaturePrice;
import com.monash.erp.wms.repository.ProductFeaturePriceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeaturePriceService {

    private final ProductFeaturePriceRepository repository;

    public ProductFeaturePriceService(ProductFeaturePriceRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeaturePrice> list() {
        return repository.findAll();
    }

    public ProductFeaturePrice get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeaturePrice %d not found".formatted(id)));
    }

    public ProductFeaturePrice create(ProductFeaturePrice entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeaturePrice update(Long id, ProductFeaturePrice entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeaturePrice %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}