package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.Requirement;
import com.monash.erp.wms.service.RequirementService;
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
@RequestMapping("/api/requirements")
public class RequirementController {

    private final RequirementService service;

    public RequirementController(RequirementService service) {
        this.service = service;
    }

    @GetMapping
    public List<Requirement> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Requirement get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Requirement> create(@RequestBody Requirement entity) {
        Requirement created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Requirement update(@PathVariable Long id, @RequestBody Requirement entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}