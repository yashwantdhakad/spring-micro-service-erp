package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPriceType;
import com.monash.erp.wms.repository.ProductPriceTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPriceTypeService {

    private final ProductPriceTypeRepository repository;

    public ProductPriceTypeService(ProductPriceTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductPriceType> list() {
        return repository.findAll();
    }

    public ProductPriceType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceType %d not found".formatted(id)));
    }

    public ProductPriceType create(ProductPriceType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPriceType update(Long id, ProductPriceType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}