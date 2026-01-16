package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductPrice;
import com.example.erp.wms.ofbiz.repository.ProductPriceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPriceService {

    private final ProductPriceRepository repository;

    public ProductPriceService(ProductPriceRepository repository) {
        this.repository = repository;
    }

    public List<ProductPrice> list() {
        return repository.findAll();
    }

    public ProductPrice get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPrice %d not found".formatted(id)));
    }

    public ProductPrice create(ProductPrice entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPrice update(Long id, ProductPrice entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPrice %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}