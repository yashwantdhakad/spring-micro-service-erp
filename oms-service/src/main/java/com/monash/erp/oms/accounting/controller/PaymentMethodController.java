package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentMethod;
import com.monash.erp.oms.accounting.service.PaymentMethodService;
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
@RequestMapping("/api/accounting/payment-methods")
public class PaymentMethodController {

    private final PaymentMethodService service;

    public PaymentMethodController(PaymentMethodService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentMethod> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentMethod get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentMethod> create(@RequestBody PaymentMethod entity) {
        PaymentMethod created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentMethod update(@PathVariable Long id, @RequestBody PaymentMethod entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
