package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortRevision;
import com.monash.erp.mfg.service.WorkEffortRevisionService;
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
@RequestMapping("/api/work-effort-revisions")
public class WorkEffortRevisionController {

    private final WorkEffortRevisionService service;

    public WorkEffortRevisionController(WorkEffortRevisionService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortRevision> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortRevision get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortRevision> create(@RequestBody WorkEffortRevision entity) {
        WorkEffortRevision created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortRevision update(@PathVariable Long id, @RequestBody WorkEffortRevision entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}