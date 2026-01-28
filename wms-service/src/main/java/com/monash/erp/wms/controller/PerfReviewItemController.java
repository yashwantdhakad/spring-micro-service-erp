package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PerfReviewItem;
import com.monash.erp.wms.service.PerfReviewItemService;
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
@RequestMapping("/api/perf-review-items")
public class PerfReviewItemController {

    private final PerfReviewItemService service;

    public PerfReviewItemController(PerfReviewItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<PerfReviewItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PerfReviewItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PerfReviewItem> create(@RequestBody PerfReviewItem entity) {
        PerfReviewItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PerfReviewItem update(@PathVariable Long id, @RequestBody PerfReviewItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}