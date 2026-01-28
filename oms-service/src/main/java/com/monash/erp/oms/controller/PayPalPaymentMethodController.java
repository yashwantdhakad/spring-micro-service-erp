package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.PayPalPaymentMethod;
import com.monash.erp.oms.service.PayPalPaymentMethodService;
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
@RequestMapping("/api/pay-pal-payment-methods")
public class PayPalPaymentMethodController {

    private final PayPalPaymentMethodService service;

    public PayPalPaymentMethodController(PayPalPaymentMethodService service) {
        this.service = service;
    }

    @GetMapping
    public List<PayPalPaymentMethod> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PayPalPaymentMethod get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PayPalPaymentMethod> create(@RequestBody PayPalPaymentMethod entity) {
        PayPalPaymentMethod created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PayPalPaymentMethod update(@PathVariable Long id, @RequestBody PayPalPaymentMethod entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}