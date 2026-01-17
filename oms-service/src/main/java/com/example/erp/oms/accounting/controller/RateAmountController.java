package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.RateAmount;
import com.example.erp.oms.accounting.service.RateAmountService;
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
@RequestMapping("/accounting/rate-amounts")
public class RateAmountController {

    private final RateAmountService service;

    public RateAmountController(RateAmountService service) {
        this.service = service;
    }

    @GetMapping
    public List<RateAmount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RateAmount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RateAmount> create(@RequestBody RateAmount entity) {
        RateAmount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RateAmount update(@PathVariable Long id, @RequestBody RateAmount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
