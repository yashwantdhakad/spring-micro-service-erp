package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PortalPageColumn;
import com.monash.erp.wms.service.PortalPageColumnService;
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
@RequestMapping("/api/portal-page-columns")
public class PortalPageColumnController {

    private final PortalPageColumnService service;

    public PortalPageColumnController(PortalPageColumnService service) {
        this.service = service;
    }

    @GetMapping
    public List<PortalPageColumn> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PortalPageColumn get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PortalPageColumn> create(@RequestBody PortalPageColumn entity) {
        PortalPageColumn created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PortalPageColumn update(@PathVariable Long id, @RequestBody PortalPageColumn entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}