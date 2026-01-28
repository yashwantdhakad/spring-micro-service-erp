package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteWorkEffort;
import com.monash.erp.oms.service.QuoteWorkEffortService;
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
@RequestMapping("/api/quote-work-efforts")
public class QuoteWorkEffortController {

    private final QuoteWorkEffortService service;

    public QuoteWorkEffortController(QuoteWorkEffortService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteWorkEffort> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteWorkEffort get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteWorkEffort> create(@RequestBody QuoteWorkEffort entity) {
        QuoteWorkEffort created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteWorkEffort update(@PathVariable Long id, @RequestBody QuoteWorkEffort entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}