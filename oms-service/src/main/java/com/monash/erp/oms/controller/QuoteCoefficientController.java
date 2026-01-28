package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteCoefficient;
import com.monash.erp.oms.service.QuoteCoefficientService;
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
@RequestMapping("/api/quote-coefficients")
public class QuoteCoefficientController {

    private final QuoteCoefficientService service;

    public QuoteCoefficientController(QuoteCoefficientService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteCoefficient> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteCoefficient get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteCoefficient> create(@RequestBody QuoteCoefficient entity) {
        QuoteCoefficient created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteCoefficient update(@PathVariable Long id, @RequestBody QuoteCoefficient entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}