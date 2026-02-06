package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeatureGroupAppl;
import com.monash.erp.wms.repository.ProductFeatureGroupApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureGroupApplService {

    private final ProductFeatureGroupApplRepository repository;

    public ProductFeatureGroupApplService(ProductFeatureGroupApplRepository repository) {
        this.repository = repository;
    }

    public List<ProductFeatureGroupAppl> list() {
        return repository.findAll();
    }

    public List<ProductFeatureGroupAppl> listByProductFeatureId(String productFeatureId) {
        return repository.findByProductFeatureId(productFeatureId);
    }

    public List<ProductFeatureGroupAppl> listByProductFeatureGroupId(String productFeatureGroupId) {
        return repository.findByProductFeatureGroupId(productFeatureGroupId);
    }

    public ProductFeatureGroupAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureGroupAppl %d not found".formatted(id)));
    }

    public ProductFeatureGroupAppl create(ProductFeatureGroupAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureGroupAppl update(Long id, ProductFeatureGroupAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureGroupAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
