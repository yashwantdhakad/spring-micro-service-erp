package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFacilityCondition;
import com.monash.erp.wms.repository.ProductFacilityConditionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFacilityConditionService {

    private final ProductFacilityConditionRepository repository;

    public ProductFacilityConditionService(ProductFacilityConditionRepository repository) {
        this.repository = repository;
    }

    public List<ProductFacilityCondition> list() {
        return repository.findAll();
    }

    public ProductFacilityCondition get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFacilityCondition %d not found".formatted(id)));
    }

    public ProductFacilityCondition create(ProductFacilityCondition entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFacilityCondition update(Long id, ProductFacilityCondition entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFacilityCondition %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}