package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntitySyncRemove;
import com.monash.erp.wms.repository.EntitySyncRemoveRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntitySyncRemoveService {

    private final EntitySyncRemoveRepository repository;

    public EntitySyncRemoveService(EntitySyncRemoveRepository repository) {
        this.repository = repository;
    }

    public List<EntitySyncRemove> list() {
        return repository.findAll();
    }

    public EntitySyncRemove get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySyncRemove %d not found".formatted(id)));
    }

    public EntitySyncRemove create(EntitySyncRemove entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntitySyncRemove update(Long id, EntitySyncRemove entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySyncRemove %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}