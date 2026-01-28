package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.TemporalExpression;
import com.monash.erp.wms.service.TemporalExpressionService;
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
@RequestMapping("/api/temporal-expressions")
public class TemporalExpressionController {

    private final TemporalExpressionService service;

    public TemporalExpressionController(TemporalExpressionService service) {
        this.service = service;
    }

    @GetMapping
    public List<TemporalExpression> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TemporalExpression get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TemporalExpression> create(@RequestBody TemporalExpression entity) {
        TemporalExpression created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TemporalExpression update(@PathVariable Long id, @RequestBody TemporalExpression entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}