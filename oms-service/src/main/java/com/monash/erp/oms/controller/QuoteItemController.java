package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteItem;
import com.monash.erp.oms.service.QuoteItemService;
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
@RequestMapping("/api/quote-items")
public class QuoteItemController {

    private final QuoteItemService service;

    public QuoteItemController(QuoteItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteItem> create(@RequestBody QuoteItem entity) {
        QuoteItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteItem update(@PathVariable Long id, @RequestBody QuoteItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}