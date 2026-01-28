package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeatureApplAttr;
import com.monash.erp.wms.repository.ProductFeatureApplAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureApplAttrService {

    private final ProductFeatureApplAttrRepository repository;

    public ProductFeatureApplAttrService(ProductFeatureApplAttrRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureApplAttr> list() {
        return repository.findAll();
    }

    public ProductFeatureApplAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureApplAttr %d not found".formatted(id)));
    }

    public ProductFeatureApplAttr create(ProductFeatureApplAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureApplAttr update(Long id, ProductFeatureApplAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureApplAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}