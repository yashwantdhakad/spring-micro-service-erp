package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.SystemProperty;
import com.monash.erp.oms.common.service.SystemPropertyService;
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
@RequestMapping("/api/common/system-propertys")
public class SystemPropertyController {

    private final SystemPropertyService service;

    public SystemPropertyController(SystemPropertyService service) {
        this.service = service;
    }

    @GetMapping
    public List<SystemProperty> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SystemProperty get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SystemProperty> create(@RequestBody SystemProperty entity) {
        SystemProperty created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SystemProperty update(@PathVariable Long id, @RequestBody SystemProperty entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
