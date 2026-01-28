package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductAverageCost;
import com.monash.erp.wms.repository.ProductAverageCostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductAverageCostService {

    private final ProductAverageCostRepository repository;

    public ProductAverageCostService(ProductAverageCostRepository repository) {
        this.repository = repository;
    }

    public List<ProductAverageCost> list() {
        return repository.findAll();
    }

    public ProductAverageCost get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAverageCost %d not found".formatted(id)));
    }

    public ProductAverageCost create(ProductAverageCost entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductAverageCost update(Long id, ProductAverageCost entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAverageCost %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}