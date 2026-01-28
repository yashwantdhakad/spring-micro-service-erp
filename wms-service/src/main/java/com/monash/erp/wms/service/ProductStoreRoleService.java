package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreRole;
import com.monash.erp.wms.repository.ProductStoreRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreRoleService {

    private final ProductStoreRoleRepository repository;

    public ProductStoreRoleService(ProductStoreRoleRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreRole> list() {
        return repository.findAll();
    }

    public ProductStoreRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreRole %d not found".formatted(id)));
    }

    public ProductStoreRole create(ProductStoreRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreRole update(Long id, ProductStoreRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}