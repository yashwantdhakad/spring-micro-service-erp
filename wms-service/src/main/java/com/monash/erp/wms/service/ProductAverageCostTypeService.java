package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductAverageCostType;
import com.monash.erp.wms.repository.ProductAverageCostTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductAverageCostTypeService {

    private final ProductAverageCostTypeRepository repository;

    public ProductAverageCostTypeService(ProductAverageCostTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductAverageCostType> list() {
        return repository.findAll();
    }

    public ProductAverageCostType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAverageCostType %d not found".formatted(id)));
    }

    public ProductAverageCostType create(ProductAverageCostType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductAverageCostType update(Long id, ProductAverageCostType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAverageCostType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}