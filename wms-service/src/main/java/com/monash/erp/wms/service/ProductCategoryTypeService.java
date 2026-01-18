package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryType;
import com.monash.erp.wms.repository.ProductCategoryTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryTypeService {

    private final ProductCategoryTypeRepository repository;

    public ProductCategoryTypeService(ProductCategoryTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryType> list() {
        return repository.findAll();
    }

    public ProductCategoryType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryType %d not found".formatted(id)));
    }

    public ProductCategoryType create(ProductCategoryType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryType update(Long id, ProductCategoryType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}