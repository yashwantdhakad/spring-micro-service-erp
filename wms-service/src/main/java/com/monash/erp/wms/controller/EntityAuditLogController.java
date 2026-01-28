package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.EntityAuditLog;
import com.monash.erp.wms.service.EntityAuditLogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/entity-audit-logs")
public class EntityAuditLogController {

    private final EntityAuditLogService service;

    public EntityAuditLogController(EntityAuditLogService service) {
        this.service = service;
    }

    @GetMapping
    public List<EntityAuditLog> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EntityAuditLog get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EntityAuditLog> create(@RequestBody EntityAuditLog entity) {
        EntityAuditLog created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EntityAuditLog update(@PathVariable Long id, @RequestBody EntityAuditLog entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}