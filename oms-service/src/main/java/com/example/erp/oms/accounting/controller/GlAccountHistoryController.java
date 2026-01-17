package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.GlAccountHistory;
import com.example.erp.oms.accounting.service.GlAccountHistoryService;
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
@RequestMapping("/accounting/gl-account-historys")
public class GlAccountHistoryController {

    private final GlAccountHistoryService service;

    public GlAccountHistoryController(GlAccountHistoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlAccountHistory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlAccountHistory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlAccountHistory> create(@RequestBody GlAccountHistory entity) {
        GlAccountHistory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlAccountHistory update(@PathVariable Long id, @RequestBody GlAccountHistory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
