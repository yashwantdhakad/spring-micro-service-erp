package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SalesOpportunityHistory;
import com.monash.erp.wms.service.SalesOpportunityHistoryService;
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
@RequestMapping("/api/sales-opportunity-histories")
public class SalesOpportunityHistoryController {

    private final SalesOpportunityHistoryService service;

    public SalesOpportunityHistoryController(SalesOpportunityHistoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<SalesOpportunityHistory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SalesOpportunityHistory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SalesOpportunityHistory> create(@RequestBody SalesOpportunityHistory entity) {
        SalesOpportunityHistory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SalesOpportunityHistory update(@PathVariable Long id, @RequestBody SalesOpportunityHistory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}