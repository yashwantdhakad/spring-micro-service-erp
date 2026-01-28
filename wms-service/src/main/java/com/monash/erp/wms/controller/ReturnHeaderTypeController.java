package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ReturnHeaderType;
import com.monash.erp.wms.service.ReturnHeaderTypeService;
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
@RequestMapping("/api/return-header-types")
public class ReturnHeaderTypeController {

    private final ReturnHeaderTypeService service;

    public ReturnHeaderTypeController(ReturnHeaderTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReturnHeaderType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReturnHeaderType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ReturnHeaderType> create(@RequestBody ReturnHeaderType entity) {
        ReturnHeaderType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ReturnHeaderType update(@PathVariable Long id, @RequestBody ReturnHeaderType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}