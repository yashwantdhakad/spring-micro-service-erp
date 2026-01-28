package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteTypeAttr;
import com.monash.erp.oms.service.QuoteTypeAttrService;
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
@RequestMapping("/api/quote-type-attrs")
public class QuoteTypeAttrController {

    private final QuoteTypeAttrService service;

    public QuoteTypeAttrController(QuoteTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteTypeAttr> create(@RequestBody QuoteTypeAttr entity) {
        QuoteTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteTypeAttr update(@PathVariable Long id, @RequestBody QuoteTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}