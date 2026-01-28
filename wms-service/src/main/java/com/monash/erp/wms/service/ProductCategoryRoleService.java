package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryRole;
import com.monash.erp.wms.repository.ProductCategoryRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryRoleService {

    private final ProductCategoryRoleRepository repository;

    public ProductCategoryRoleService(ProductCategoryRoleRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryRole> list() {
        return repository.findAll();
    }

    public ProductCategoryRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryRole %d not found".formatted(id)));
    }

    public ProductCategoryRole create(ProductCategoryRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryRole update(Long id, ProductCategoryRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}