package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeatureIactnType;
import com.monash.erp.wms.repository.ProductFeatureIactnTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureIactnTypeService {

    private final ProductFeatureIactnTypeRepository repository;

    public ProductFeatureIactnTypeService(ProductFeatureIactnTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureIactnType> list() {
        return repository.findAll();
    }

    public ProductFeatureIactnType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureIactnType %d not found".formatted(id)));
    }

    public ProductFeatureIactnType create(ProductFeatureIactnType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureIactnType update(Long id, ProductFeatureIactnType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureIactnType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}