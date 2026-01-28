package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntitySyncHistory;
import com.monash.erp.wms.repository.EntitySyncHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntitySyncHistoryService {

    private final EntitySyncHistoryRepository repository;

    public EntitySyncHistoryService(EntitySyncHistoryRepository repository) {
        this.repository = repository;
    }

    public List<EntitySyncHistory> list() {
        return repository.findAll();
    }

    public EntitySyncHistory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySyncHistory %d not found".formatted(id)));
    }

    public EntitySyncHistory create(EntitySyncHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntitySyncHistory update(Long id, EntitySyncHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntitySyncHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}