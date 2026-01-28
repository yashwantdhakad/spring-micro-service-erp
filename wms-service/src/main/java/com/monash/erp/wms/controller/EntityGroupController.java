package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.EntityGroup;
import com.monash.erp.wms.service.EntityGroupService;
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
@RequestMapping("/api/entity-groups")
public class EntityGroupController {

    private final EntityGroupService service;

    public EntityGroupController(EntityGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<EntityGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EntityGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EntityGroup> create(@RequestBody EntityGroup entity) {
        EntityGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EntityGroup update(@PathVariable Long id, @RequestBody EntityGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}