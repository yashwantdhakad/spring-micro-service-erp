package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ValidResponsibility;
import com.monash.erp.wms.service.ValidResponsibilityService;
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
@RequestMapping("/api/valid-responsibilities")
public class ValidResponsibilityController {

    private final ValidResponsibilityService service;

    public ValidResponsibilityController(ValidResponsibilityService service) {
        this.service = service;
    }

    @GetMapping
    public List<ValidResponsibility> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ValidResponsibility get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ValidResponsibility> create(@RequestBody ValidResponsibility entity) {
        ValidResponsibility created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ValidResponsibility update(@PathVariable Long id, @RequestBody ValidResponsibility entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}