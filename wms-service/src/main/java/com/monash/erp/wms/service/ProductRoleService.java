package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductRole;
import com.monash.erp.wms.repository.ProductRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductRoleService {

    private final ProductRoleRepository repository;

    public ProductRoleService(ProductRoleRepository repository) {
        this.repository = repository;
    }

    public List<ProductRole> list() {
        return repository.findAll();
    }

    public ProductRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductRole %d not found".formatted(id)));
    }

    public ProductRole create(ProductRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductRole update(Long id, ProductRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}