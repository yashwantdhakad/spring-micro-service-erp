package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.PaymentBudgetAllocation;
import com.monash.erp.oms.service.PaymentBudgetAllocationService;
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
@RequestMapping("/api/payment-budget-allocations")
public class PaymentBudgetAllocationController {

    private final PaymentBudgetAllocationService service;

    public PaymentBudgetAllocationController(PaymentBudgetAllocationService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentBudgetAllocation> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentBudgetAllocation get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentBudgetAllocation> create(@RequestBody PaymentBudgetAllocation entity) {
        PaymentBudgetAllocation created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentBudgetAllocation update(@PathVariable Long id, @RequestBody PaymentBudgetAllocation entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}