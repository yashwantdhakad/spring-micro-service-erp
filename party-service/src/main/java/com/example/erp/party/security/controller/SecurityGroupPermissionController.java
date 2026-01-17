package com.example.erp.party.security.controller;

import com.example.erp.party.security.domain.SecurityGroupPermission;
import com.example.erp.party.security.service.SecurityGroupPermissionService;
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
@RequestMapping("/security/security-group-permissions")
public class SecurityGroupPermissionController {

    private final SecurityGroupPermissionService service;

    public SecurityGroupPermissionController(SecurityGroupPermissionService service) {
        this.service = service;
    }

    @GetMapping
    public List<SecurityGroupPermission> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SecurityGroupPermission get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SecurityGroupPermission> create(@RequestBody SecurityGroupPermission entity) {
        SecurityGroupPermission created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SecurityGroupPermission update(@PathVariable Long id, @RequestBody SecurityGroupPermission entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
