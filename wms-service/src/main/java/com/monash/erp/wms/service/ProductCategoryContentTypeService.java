package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryContentType;
import com.monash.erp.wms.repository.ProductCategoryContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryContentTypeService {

    private final ProductCategoryContentTypeRepository repository;

    public ProductCategoryContentTypeService(ProductCategoryContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryContentType> list() {
        return repository.findAll();
    }

    public ProductCategoryContentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryContentType %d not found".formatted(id)));
    }

    public ProductCategoryContentType create(ProductCategoryContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryContentType update(Long id, ProductCategoryContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}