package com.example.erp.mfg.ofbiz.controller;

import com.example.erp.mfg.ofbiz.domain.WorkEffortInventoryProduced;
import com.example.erp.mfg.ofbiz.service.WorkEffortInventoryProducedService;
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
@RequestMapping("/ofbiz/work-effort-inventory-produceds")
public class WorkEffortInventoryProducedController {

    private final WorkEffortInventoryProducedService service;

    public WorkEffortInventoryProducedController(WorkEffortInventoryProducedService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortInventoryProduced> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortInventoryProduced get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortInventoryProduced> create(@RequestBody WorkEffortInventoryProduced entity) {
        WorkEffortInventoryProduced created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortInventoryProduced update(@PathVariable Long id, @RequestBody WorkEffortInventoryProduced entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}