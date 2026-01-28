package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SalesOpportunityStage;
import com.monash.erp.wms.service.SalesOpportunityStageService;
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
@RequestMapping("/api/sales-opportunity-stages")
public class SalesOpportunityStageController {

    private final SalesOpportunityStageService service;

    public SalesOpportunityStageController(SalesOpportunityStageService service) {
        this.service = service;
    }

    @GetMapping
    public List<SalesOpportunityStage> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SalesOpportunityStage get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SalesOpportunityStage> create(@RequestBody SalesOpportunityStage entity) {
        SalesOpportunityStage created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SalesOpportunityStage update(@PathVariable Long id, @RequestBody SalesOpportunityStage entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}