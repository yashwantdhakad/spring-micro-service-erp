package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteContentType;
import com.monash.erp.oms.service.QuoteContentTypeService;
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
@RequestMapping("/api/quote-content-types")
public class QuoteContentTypeController {

    private final QuoteContentTypeService service;

    public QuoteContentTypeController(QuoteContentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteContentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteContentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteContentType> create(@RequestBody QuoteContentType entity) {
        QuoteContentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteContentType update(@PathVariable Long id, @RequestBody QuoteContentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}