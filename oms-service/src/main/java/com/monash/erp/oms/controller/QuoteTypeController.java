package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteType;
import com.monash.erp.oms.service.QuoteTypeService;
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
@RequestMapping("/api/quote-types")
public class QuoteTypeController {

    private final QuoteTypeService service;

    public QuoteTypeController(QuoteTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteType> create(@RequestBody QuoteType entity) {
        QuoteType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteType update(@PathVariable Long id, @RequestBody QuoteType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}