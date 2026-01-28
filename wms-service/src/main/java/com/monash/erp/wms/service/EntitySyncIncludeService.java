package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntitySyncInclude;
import com.monash.erp.wms.repository.EntitySyncIncludeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntitySyncIncludeService {

    private final EntitySyncIncludeRepository repository;

    public EntitySyncIncludeService(EntitySyncIncludeRepository repository) {
        this.repository = repository;
    }

    public List<EntitySyncInclude> list() {
        return repository.findAll();
    }

    public EntitySyncInclude get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySyncInclude %d not found".formatted(id)));
    }

    public EntitySyncInclude create(EntitySyncInclude entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntitySyncInclude update(Long id, EntitySyncInclude entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySyncInclude %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}