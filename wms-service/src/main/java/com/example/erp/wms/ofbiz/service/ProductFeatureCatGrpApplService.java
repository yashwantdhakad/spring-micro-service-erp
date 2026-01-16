package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductFeatureCatGrpAppl;
import com.example.erp.wms.ofbiz.repository.ProductFeatureCatGrpApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureCatGrpApplService {

    private final ProductFeatureCatGrpApplRepository repository;

    public ProductFeatureCatGrpApplService(ProductFeatureCatGrpApplRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureCatGrpAppl> list() {
        return repository.findAll();
    }

    public ProductFeatureCatGrpAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureCatGrpAppl %d not found".formatted(id)));
    }

    public ProductFeatureCatGrpAppl create(ProductFeatureCatGrpAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureCatGrpAppl update(Long id, ProductFeatureCatGrpAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureCatGrpAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}