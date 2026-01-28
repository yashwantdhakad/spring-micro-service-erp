package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.EntitySyncIncludeGroup;
import com.monash.erp.wms.service.EntitySyncIncludeGroupService;
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
@RequestMapping("/api/entity-sync-include-groups")
public class EntitySyncIncludeGroupController {

    private final EntitySyncIncludeGroupService service;

    public EntitySyncIncludeGroupController(EntitySyncIncludeGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<EntitySyncIncludeGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EntitySyncIncludeGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EntitySyncIncludeGroup> create(@RequestBody EntitySyncIncludeGroup entity) {
        EntitySyncIncludeGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EntitySyncIncludeGroup update(@PathVariable Long id, @RequestBody EntitySyncIncludeGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}