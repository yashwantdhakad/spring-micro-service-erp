package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PerfReview;
import com.monash.erp.wms.service.PerfReviewService;
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
@RequestMapping("/api/perf-reviews")
public class PerfReviewController {

    private final PerfReviewService service;

    public PerfReviewController(PerfReviewService service) {
        this.service = service;
    }

    @GetMapping
    public List<PerfReview> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PerfReview get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PerfReview> create(@RequestBody PerfReview entity) {
        PerfReview created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PerfReview update(@PathVariable Long id, @RequestBody PerfReview entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}