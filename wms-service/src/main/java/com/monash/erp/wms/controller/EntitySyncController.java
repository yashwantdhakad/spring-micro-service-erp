package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.EntitySync;
import com.monash.erp.wms.service.EntitySyncService;
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
@RequestMapping("/api/entity-syncs")
public class EntitySyncController {

    private final EntitySyncService service;

    public EntitySyncController(EntitySyncService service) {
        this.service = service;
    }

    @GetMapping
    public List<EntitySync> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EntitySync get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EntitySync> create(@RequestBody EntitySync entity) {
        EntitySync created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EntitySync update(@PathVariable Long id, @RequestBody EntitySync entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}