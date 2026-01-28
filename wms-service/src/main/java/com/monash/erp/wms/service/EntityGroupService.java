package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntityGroup;
import com.monash.erp.wms.repository.EntityGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntityGroupService {

    private final EntityGroupRepository repository;

    public EntityGroupService(EntityGroupRepository repository) {
        this.repository = repository;
    }

    public List<EntityGroup> list() {
        return repository.findAll();
    }

    public EntityGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntityGroup %d not found".formatted(id)));
    }

    public EntityGroup create(EntityGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntityGroup update(Long id, EntityGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntityGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}