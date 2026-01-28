package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.EnumerationType;
import com.monash.erp.oms.service.EnumerationTypeService;
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
@RequestMapping("/api/enumeration-types")
public class EnumerationTypeController {

    private final EnumerationTypeService service;

    public EnumerationTypeController(EnumerationTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EnumerationType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EnumerationType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EnumerationType> create(@RequestBody EnumerationType entity) {
        EnumerationType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EnumerationType update(@PathVariable Long id, @RequestBody EnumerationType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}