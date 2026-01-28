package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.GlAccountRole;
import com.monash.erp.oms.service.GlAccountRoleService;
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
@RequestMapping("/api/gl-account-roles")
public class GlAccountRoleController {

    private final GlAccountRoleService service;

    public GlAccountRoleController(GlAccountRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlAccountRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlAccountRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlAccountRole> create(@RequestBody GlAccountRole entity) {
        GlAccountRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlAccountRole update(@PathVariable Long id, @RequestBody GlAccountRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}