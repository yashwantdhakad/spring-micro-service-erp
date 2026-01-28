package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreGroupType;
import com.monash.erp.wms.repository.ProductStoreGroupTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreGroupTypeService {

    private final ProductStoreGroupTypeRepository repository;

    public ProductStoreGroupTypeService(ProductStoreGroupTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreGroupType> list() {
        return repository.findAll();
    }

    public ProductStoreGroupType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroupType %d not found".formatted(id)));
    }

    public ProductStoreGroupType create(ProductStoreGroupType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreGroupType update(Long id, ProductStoreGroupType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroupType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}