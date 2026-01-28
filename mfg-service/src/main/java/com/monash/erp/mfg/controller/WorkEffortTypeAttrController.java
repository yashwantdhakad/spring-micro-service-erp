package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortTypeAttr;
import com.monash.erp.mfg.service.WorkEffortTypeAttrService;
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
@RequestMapping("/api/work-effort-type-attrs")
public class WorkEffortTypeAttrController {

    private final WorkEffortTypeAttrService service;

    public WorkEffortTypeAttrController(WorkEffortTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortTypeAttr> create(@RequestBody WorkEffortTypeAttr entity) {
        WorkEffortTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortTypeAttr update(@PathVariable Long id, @RequestBody WorkEffortTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}