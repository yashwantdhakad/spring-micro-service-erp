package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.GlReconciliationEntry;
import com.example.erp.oms.accounting.service.GlReconciliationEntryService;
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
@RequestMapping("/accounting/gl-reconciliation-entrys")
public class GlReconciliationEntryController {

    private final GlReconciliationEntryService service;

    public GlReconciliationEntryController(GlReconciliationEntryService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlReconciliationEntry> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlReconciliationEntry get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlReconciliationEntry> create(@RequestBody GlReconciliationEntry entity) {
        GlReconciliationEntry created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlReconciliationEntry update(@PathVariable Long id, @RequestBody GlReconciliationEntry entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
