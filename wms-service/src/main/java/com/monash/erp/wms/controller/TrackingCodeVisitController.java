package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.TrackingCodeVisit;
import com.monash.erp.wms.service.TrackingCodeVisitService;
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
@RequestMapping("/api/tracking-code-visits")
public class TrackingCodeVisitController {

    private final TrackingCodeVisitService service;

    public TrackingCodeVisitController(TrackingCodeVisitService service) {
        this.service = service;
    }

    @GetMapping
    public List<TrackingCodeVisit> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TrackingCodeVisit get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TrackingCodeVisit> create(@RequestBody TrackingCodeVisit entity) {
        TrackingCodeVisit created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TrackingCodeVisit update(@PathVariable Long id, @RequestBody TrackingCodeVisit entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}