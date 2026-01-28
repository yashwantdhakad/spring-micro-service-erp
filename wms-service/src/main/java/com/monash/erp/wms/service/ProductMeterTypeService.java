package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductMeterType;
import com.monash.erp.wms.repository.ProductMeterTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductMeterTypeService {

    private final ProductMeterTypeRepository repository;

    public ProductMeterTypeService(ProductMeterTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductMeterType> list() {
        return repository.findAll();
    }

    public ProductMeterType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductMeterType %d not found".formatted(id)));
    }

    public ProductMeterType create(ProductMeterType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductMeterType update(Long id, ProductMeterType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductMeterType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}