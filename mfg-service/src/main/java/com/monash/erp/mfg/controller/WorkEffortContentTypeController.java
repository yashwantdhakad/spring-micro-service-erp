package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortContentType;
import com.monash.erp.mfg.service.WorkEffortContentTypeService;
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
@RequestMapping("/api/work-effort-content-types")
public class WorkEffortContentTypeController {

    private final WorkEffortContentTypeService service;

    public WorkEffortContentTypeController(WorkEffortContentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortContentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortContentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortContentType> create(@RequestBody WorkEffortContentType entity) {
        WorkEffortContentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortContentType update(@PathVariable Long id, @RequestBody WorkEffortContentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}