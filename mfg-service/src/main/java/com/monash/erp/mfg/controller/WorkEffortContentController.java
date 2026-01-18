package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortContent;
import com.monash.erp.mfg.service.WorkEffortContentService;
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
@RequestMapping("/api/work-effort-contents")
public class WorkEffortContentController {

    private final WorkEffortContentService service;

    public WorkEffortContentController(WorkEffortContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortContent> create(@RequestBody WorkEffortContent entity) {
        WorkEffortContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortContent update(@PathVariable Long id, @RequestBody WorkEffortContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}