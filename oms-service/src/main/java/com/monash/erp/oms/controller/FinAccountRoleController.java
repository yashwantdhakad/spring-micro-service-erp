package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.FinAccountRole;
import com.monash.erp.oms.service.FinAccountRoleService;
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
@RequestMapping("/api/fin-account-roles")
public class FinAccountRoleController {

    private final FinAccountRoleService service;

    public FinAccountRoleController(FinAccountRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinAccountRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FinAccountRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FinAccountRole> create(@RequestBody FinAccountRole entity) {
        FinAccountRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FinAccountRole update(@PathVariable Long id, @RequestBody FinAccountRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}