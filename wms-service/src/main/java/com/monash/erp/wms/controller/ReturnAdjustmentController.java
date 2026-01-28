package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ReturnAdjustment;
import com.monash.erp.wms.service.ReturnAdjustmentService;
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
@RequestMapping("/api/return-adjustments")
public class ReturnAdjustmentController {

    private final ReturnAdjustmentService service;

    public ReturnAdjustmentController(ReturnAdjustmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReturnAdjustment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReturnAdjustment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ReturnAdjustment> create(@RequestBody ReturnAdjustment entity) {
        ReturnAdjustment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ReturnAdjustment update(@PathVariable Long id, @RequestBody ReturnAdjustment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}