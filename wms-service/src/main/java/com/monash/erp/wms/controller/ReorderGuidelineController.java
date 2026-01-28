package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ReorderGuideline;
import com.monash.erp.wms.service.ReorderGuidelineService;
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
@RequestMapping("/api/reorder-guidelines")
public class ReorderGuidelineController {

    private final ReorderGuidelineService service;

    public ReorderGuidelineController(ReorderGuidelineService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReorderGuideline> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReorderGuideline get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ReorderGuideline> create(@RequestBody ReorderGuideline entity) {
        ReorderGuideline created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ReorderGuideline update(@PathVariable Long id, @RequestBody ReorderGuideline entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}