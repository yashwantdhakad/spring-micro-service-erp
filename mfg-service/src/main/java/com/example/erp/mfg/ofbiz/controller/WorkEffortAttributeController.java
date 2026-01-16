package com.example.erp.mfg.ofbiz.controller;

import com.example.erp.mfg.ofbiz.domain.WorkEffortAttribute;
import com.example.erp.mfg.ofbiz.service.WorkEffortAttributeService;
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
@RequestMapping("/ofbiz/work-effort-attributes")
public class WorkEffortAttributeController {

    private final WorkEffortAttributeService service;

    public WorkEffortAttributeController(WorkEffortAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortAttribute> create(@RequestBody WorkEffortAttribute entity) {
        WorkEffortAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortAttribute update(@PathVariable Long id, @RequestBody WorkEffortAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}