package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.ProdCatalogRole;
import com.monash.erp.oms.repository.ProdCatalogRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdCatalogRoleService {

    private final ProdCatalogRoleRepository repository;

    public ProdCatalogRoleService(ProdCatalogRoleRepository repository) {
        this.repository = repository;
    }

    public List<ProdCatalogRole> list() {
        return repository.findAll();
    }

    public ProdCatalogRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalogRole %d not found".formatted(id)));
    }

    public ProdCatalogRole create(ProdCatalogRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProdCatalogRole update(Long id, ProdCatalogRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalogRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}