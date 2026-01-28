package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteContent;
import com.monash.erp.oms.service.QuoteContentService;
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
@RequestMapping("/api/quote-contents")
public class QuoteContentController {

    private final QuoteContentService service;

    public QuoteContentController(QuoteContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteContent> create(@RequestBody QuoteContent entity) {
        QuoteContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteContent update(@PathVariable Long id, @RequestBody QuoteContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}