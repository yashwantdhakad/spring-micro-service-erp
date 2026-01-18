package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortInventoryAssign;
import com.monash.erp.mfg.service.WorkEffortInventoryAssignService;
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
@RequestMapping("/ofbiz/work-effort-inventory-assigns")
public class WorkEffortInventoryAssignController {

    private final WorkEffortInventoryAssignService service;

    public WorkEffortInventoryAssignController(WorkEffortInventoryAssignService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortInventoryAssign> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortInventoryAssign get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortInventoryAssign> create(@RequestBody WorkEffortInventoryAssign entity) {
        WorkEffortInventoryAssign created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortInventoryAssign update(@PathVariable Long id, @RequestBody WorkEffortInventoryAssign entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}