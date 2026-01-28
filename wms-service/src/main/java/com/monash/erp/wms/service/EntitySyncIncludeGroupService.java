package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntitySyncIncludeGroup;
import com.monash.erp.wms.repository.EntitySyncIncludeGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntitySyncIncludeGroupService {

    private final EntitySyncIncludeGroupRepository repository;

    public EntitySyncIncludeGroupService(EntitySyncIncludeGroupRepository repository) {
        this.repository = repository;
    }

    public List<EntitySyncIncludeGroup> list() {
        return repository.findAll();
    }

    public EntitySyncIncludeGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySyncIncludeGroup %d not found".formatted(id)));
    }

    public EntitySyncIncludeGroup create(EntitySyncIncludeGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntitySyncIncludeGroup update(Long id, EntitySyncIncludeGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySyncIncludeGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}