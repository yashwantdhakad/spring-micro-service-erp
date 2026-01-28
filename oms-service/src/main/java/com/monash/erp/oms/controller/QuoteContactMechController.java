package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteContactMech;
import com.monash.erp.oms.service.QuoteContactMechService;
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
@RequestMapping("/api/quote-contact-meches")
public class QuoteContactMechController {

    private final QuoteContactMechService service;

    public QuoteContactMechController(QuoteContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteContactMech> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteContactMech> create(@RequestBody QuoteContactMech entity) {
        QuoteContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteContactMech update(@PathVariable Long id, @RequestBody QuoteContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}