package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryGlAccount;
import com.monash.erp.wms.repository.ProductCategoryGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryGlAccountService {

    private final ProductCategoryGlAccountRepository repository;

    public ProductCategoryGlAccountService(ProductCategoryGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryGlAccount> list() {
        return repository.findAll();
    }

    public ProductCategoryGlAccount get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryGlAccount %d not found".formatted(id)));
    }

    public ProductCategoryGlAccount create(ProductCategoryGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryGlAccount update(Long id, ProductCategoryGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}