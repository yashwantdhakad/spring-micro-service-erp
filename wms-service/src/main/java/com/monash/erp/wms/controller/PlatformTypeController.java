package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PlatformType;
import com.monash.erp.wms.service.PlatformTypeService;
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
@RequestMapping("/api/platform-types")
public class PlatformTypeController {

    private final PlatformTypeService service;

    public PlatformTypeController(PlatformTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PlatformType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PlatformType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PlatformType> create(@RequestBody PlatformType entity) {
        PlatformType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PlatformType update(@PathVariable Long id, @RequestBody PlatformType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}