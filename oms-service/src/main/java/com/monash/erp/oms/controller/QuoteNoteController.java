package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteNote;
import com.monash.erp.oms.service.QuoteNoteService;
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
@RequestMapping("/api/quote-notes")
public class QuoteNoteController {

    private final QuoteNoteService service;

    public QuoteNoteController(QuoteNoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteNote> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteNote get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteNote> create(@RequestBody QuoteNote entity) {
        QuoteNote created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteNote update(@PathVariable Long id, @RequestBody QuoteNote entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}