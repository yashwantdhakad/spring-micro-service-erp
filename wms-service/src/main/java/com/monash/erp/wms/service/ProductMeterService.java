package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductMeter;
import com.monash.erp.wms.repository.ProductMeterRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductMeterService {

    private final ProductMeterRepository repository;

    public ProductMeterService(ProductMeterRepository repository) {
        this.repository = repository;
    }

    public List<ProductMeter> list() {
        return repository.findAll();
    }

    public ProductMeter get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductMeter %d not found".formatted(id)));
    }

    public ProductMeter create(ProductMeter entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductMeter update(Long id, ProductMeter entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductMeter %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}