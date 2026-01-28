package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntitySync;
import com.monash.erp.wms.repository.EntitySyncRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntitySyncService {

    private final EntitySyncRepository repository;

    public EntitySyncService(EntitySyncRepository repository) {
        this.repository = repository;
    }

    public List<EntitySync> list() {
        return repository.findAll();
    }

    public EntitySync get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySync %d not found".formatted(id)));
    }

    public EntitySync create(EntitySync entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntitySync update(Long id, EntitySync entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySync %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}