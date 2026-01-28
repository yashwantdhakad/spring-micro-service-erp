package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntityGroupEntry;
import com.monash.erp.wms.repository.EntityGroupEntryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntityGroupEntryService {

    private final EntityGroupEntryRepository repository;

    public EntityGroupEntryService(EntityGroupEntryRepository repository) {
        this.repository = repository;
    }

    public List<EntityGroupEntry> list() {
        return repository.findAll();
    }

    public EntityGroupEntry get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntityGroupEntry %d not found".formatted(id)));
    }

    public EntityGroupEntry create(EntityGroupEntry entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntityGroupEntry update(Long id, EntityGroupEntry entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntityGroupEntry %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}