package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductGlAccount;
import com.monash.erp.wms.repository.ProductGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductGlAccountService {

    private final ProductGlAccountRepository repository;

    public ProductGlAccountService(ProductGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<ProductGlAccount> list() {
        return repository.findAll();
    }

    public ProductGlAccount get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductGlAccount %d not found".formatted(id)));
    }

    public ProductGlAccount create(ProductGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductGlAccount update(Long id, ProductGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}