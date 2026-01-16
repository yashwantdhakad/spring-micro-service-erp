package com.example.erp.party.ofbiz.controller;

import com.example.erp.party.ofbiz.domain.RoleType;
import com.example.erp.party.ofbiz.service.RoleTypeService;
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
@RequestMapping("/ofbiz/role-types")
public class RoleTypeController {

    private final RoleTypeService service;

    public RoleTypeController(RoleTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<RoleType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RoleType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RoleType> create(@RequestBody RoleType entity) {
        RoleType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RoleType update(@PathVariable Long id, @RequestBody RoleType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}