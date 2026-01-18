package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.Enumeration;
import com.monash.erp.oms.common.service.EnumerationService;
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
@RequestMapping("/api/common/enumerations")
public class EnumerationController {

    private final EnumerationService service;

    public EnumerationController(EnumerationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Enumeration> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Enumeration get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Enumeration> create(@RequestBody Enumeration entity) {
        Enumeration created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Enumeration update(@PathVariable Long id, @RequestBody Enumeration entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
