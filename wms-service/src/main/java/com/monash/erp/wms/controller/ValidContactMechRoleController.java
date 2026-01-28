package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ValidContactMechRole;
import com.monash.erp.wms.service.ValidContactMechRoleService;
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
@RequestMapping("/api/valid-contact-mech-roles")
public class ValidContactMechRoleController {

    private final ValidContactMechRoleService service;

    public ValidContactMechRoleController(ValidContactMechRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ValidContactMechRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ValidContactMechRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ValidContactMechRole> create(@RequestBody ValidContactMechRole entity) {
        ValidContactMechRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ValidContactMechRole update(@PathVariable Long id, @RequestBody ValidContactMechRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}