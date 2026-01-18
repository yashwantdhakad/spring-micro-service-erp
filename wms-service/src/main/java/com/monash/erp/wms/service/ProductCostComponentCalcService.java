package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCostComponentCalc;
import com.monash.erp.wms.repository.ProductCostComponentCalcRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCostComponentCalcService {

    private final ProductCostComponentCalcRepository repository;

    public ProductCostComponentCalcService(ProductCostComponentCalcRepository repository) {
        this.repository = repository;
    }

    public List<ProductCostComponentCalc> list() {
        return repository.findAll();
    }

    public ProductCostComponentCalc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCostComponentCalc %d not found".formatted(id)));
    }

    public ProductCostComponentCalc create(ProductCostComponentCalc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCostComponentCalc update(Long id, ProductCostComponentCalc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCostComponentCalc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}