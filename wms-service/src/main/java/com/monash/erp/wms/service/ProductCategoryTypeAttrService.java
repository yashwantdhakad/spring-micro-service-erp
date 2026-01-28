package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryTypeAttr;
import com.monash.erp.wms.repository.ProductCategoryTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryTypeAttrService {

    private final ProductCategoryTypeAttrRepository repository;

    public ProductCategoryTypeAttrService(ProductCategoryTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryTypeAttr> list() {
        return repository.findAll();
    }

    public ProductCategoryTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryTypeAttr %d not found".formatted(id)));
    }

    public ProductCategoryTypeAttr create(ProductCategoryTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryTypeAttr update(Long id, ProductCategoryTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}