package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteAdjustment;
import com.monash.erp.oms.service.QuoteAdjustmentService;
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
@RequestMapping("/api/quote-adjustments")
public class QuoteAdjustmentController {

    private final QuoteAdjustmentService service;

    public QuoteAdjustmentController(QuoteAdjustmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteAdjustment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteAdjustment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteAdjustment> create(@RequestBody QuoteAdjustment entity) {
        QuoteAdjustment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteAdjustment update(@PathVariable Long id, @RequestBody QuoteAdjustment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}