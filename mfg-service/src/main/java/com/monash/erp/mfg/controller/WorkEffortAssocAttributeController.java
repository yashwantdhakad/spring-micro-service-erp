package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortAssocAttribute;
import com.monash.erp.mfg.service.WorkEffortAssocAttributeService;
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
@RequestMapping("/api/work-effort-assoc-attributes")
public class WorkEffortAssocAttributeController {

    private final WorkEffortAssocAttributeService service;

    public WorkEffortAssocAttributeController(WorkEffortAssocAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortAssocAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortAssocAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortAssocAttribute> create(@RequestBody WorkEffortAssocAttribute entity) {
        WorkEffortAssocAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortAssocAttribute update(@PathVariable Long id, @RequestBody WorkEffortAssocAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}