package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EntityAuditLog;
import com.monash.erp.wms.repository.EntityAuditLogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EntityAuditLogService {

    private final EntityAuditLogRepository repository;

    public EntityAuditLogService(EntityAuditLogRepository repository) {
        this.repository = repository;
    }

    public List<EntityAuditLog> list() {
        return repository.findAll();
    }

    public EntityAuditLog get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EntityAuditLog %d not found".formatted(id)));
    }

    public EntityAuditLog create(EntityAuditLog entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EntityAuditLog update(Long id, EntityAuditLog entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EntityAuditLog %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}