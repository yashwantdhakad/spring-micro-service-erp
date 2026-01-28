package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntityKeyStore;
import com.monash.erp.wms.repository.EntityKeyStoreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntityKeyStoreService {

    private final EntityKeyStoreRepository repository;

    public EntityKeyStoreService(EntityKeyStoreRepository repository) {
        this.repository = repository;
    }

    public List<EntityKeyStore> list() {
        return repository.findAll();
    }

    public EntityKeyStore get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntityKeyStore %d not found".formatted(id)));
    }

    public EntityKeyStore create(EntityKeyStore entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntityKeyStore update(Long id, EntityKeyStore entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntityKeyStore %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}