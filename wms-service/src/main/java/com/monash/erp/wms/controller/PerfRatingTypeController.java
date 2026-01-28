package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PerfRatingType;
import com.monash.erp.wms.service.PerfRatingTypeService;
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
@RequestMapping("/api/perf-rating-types")
public class PerfRatingTypeController {

    private final PerfRatingTypeService service;

    public PerfRatingTypeController(PerfRatingTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PerfRatingType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PerfRatingType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PerfRatingType> create(@RequestBody PerfRatingType entity) {
        PerfRatingType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PerfRatingType update(@PathVariable Long id, @RequestBody PerfRatingType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}