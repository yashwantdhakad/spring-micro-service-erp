package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductCostComponentCalc;
import com.example.erp.wms.ofbiz.repository.ProductCostComponentCalcRepository;
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