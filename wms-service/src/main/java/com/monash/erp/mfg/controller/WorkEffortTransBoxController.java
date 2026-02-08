package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortTransBox;
import com.monash.erp.mfg.service.WorkEffortTransBoxService;
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
@RequestMapping("/api/work-effort-trans-boxes")
public class WorkEffortTransBoxController {

    private final WorkEffortTransBoxService service;

    public WorkEffortTransBoxController(WorkEffortTransBoxService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortTransBox> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortTransBox get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortTransBox> create(@RequestBody WorkEffortTransBox entity) {
        WorkEffortTransBox created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortTransBox update(@PathVariable Long id, @RequestBody WorkEffortTransBox entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}