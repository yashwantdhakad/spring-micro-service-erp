package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.GlResourceType;
import com.monash.erp.oms.service.GlResourceTypeService;
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
@RequestMapping("/api/gl-resource-types")
public class GlResourceTypeController {

    private final GlResourceTypeService service;

    public GlResourceTypeController(GlResourceTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlResourceType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlResourceType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlResourceType> create(@RequestBody GlResourceType entity) {
        GlResourceType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlResourceType update(@PathVariable Long id, @RequestBody GlResourceType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}