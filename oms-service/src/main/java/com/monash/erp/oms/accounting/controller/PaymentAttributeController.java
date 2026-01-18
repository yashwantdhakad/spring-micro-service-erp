package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentAttribute;
import com.monash.erp.oms.accounting.service.PaymentAttributeService;
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
@RequestMapping("/api/accounting/payment-attributes")
public class PaymentAttributeController {

    private final PaymentAttributeService service;

    public PaymentAttributeController(PaymentAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentAttribute> create(@RequestBody PaymentAttribute entity) {
        PaymentAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentAttribute update(@PathVariable Long id, @RequestBody PaymentAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
