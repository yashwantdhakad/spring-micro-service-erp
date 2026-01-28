package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SalesOpportunityCompetitor;
import com.monash.erp.wms.service.SalesOpportunityCompetitorService;
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
@RequestMapping("/api/sales-opportunity-competitors")
public class SalesOpportunityCompetitorController {

    private final SalesOpportunityCompetitorService service;

    public SalesOpportunityCompetitorController(SalesOpportunityCompetitorService service) {
        this.service = service;
    }

    @GetMapping
    public List<SalesOpportunityCompetitor> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SalesOpportunityCompetitor get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SalesOpportunityCompetitor> create(@RequestBody SalesOpportunityCompetitor entity) {
        SalesOpportunityCompetitor created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SalesOpportunityCompetitor update(@PathVariable Long id, @RequestBody SalesOpportunityCompetitor entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}