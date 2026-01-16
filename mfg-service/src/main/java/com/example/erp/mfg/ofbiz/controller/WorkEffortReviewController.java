package com.example.erp.mfg.ofbiz.controller;

import com.example.erp.mfg.ofbiz.domain.WorkEffortReview;
import com.example.erp.mfg.ofbiz.service.WorkEffortReviewService;
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
@RequestMapping("/ofbiz/work-effort-reviews")
public class WorkEffortReviewController {

    private final WorkEffortReviewService service;

    public WorkEffortReviewController(WorkEffortReviewService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortReview> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortReview get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortReview> create(@RequestBody WorkEffortReview entity) {
        WorkEffortReview created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortReview update(@PathVariable Long id, @RequestBody WorkEffortReview entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}