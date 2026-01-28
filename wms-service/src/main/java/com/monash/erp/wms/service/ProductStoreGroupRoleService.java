package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreGroupRole;
import com.monash.erp.wms.repository.ProductStoreGroupRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreGroupRoleService {

    private final ProductStoreGroupRoleRepository repository;

    public ProductStoreGroupRoleService(ProductStoreGroupRoleRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreGroupRole> list() {
        return repository.findAll();
    }

    public ProductStoreGroupRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroupRole %d not found".formatted(id)));
    }

    public ProductStoreGroupRole create(ProductStoreGroupRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreGroupRole update(Long id, ProductStoreGroupRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroupRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}