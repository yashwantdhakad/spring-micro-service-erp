package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProtectedView;
import com.monash.erp.wms.service.ProtectedViewService;
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
@RequestMapping("/api/protected-views")
public class ProtectedViewController {

    private final ProtectedViewService service;

    public ProtectedViewController(ProtectedViewService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProtectedView> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProtectedView get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProtectedView> create(@RequestBody ProtectedView entity) {
        ProtectedView created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProtectedView update(@PathVariable Long id, @RequestBody ProtectedView entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}