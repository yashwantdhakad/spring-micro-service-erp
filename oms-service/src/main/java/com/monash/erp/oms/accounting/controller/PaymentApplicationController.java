package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentApplication;
import com.monash.erp.oms.accounting.service.PaymentApplicationService;
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
@RequestMapping("/accounting/payment-applications")
public class PaymentApplicationController {

    private final PaymentApplicationService service;

    public PaymentApplicationController(PaymentApplicationService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentApplication> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentApplication get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentApplication> create(@RequestBody PaymentApplication entity) {
        PaymentApplication created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentApplication update(@PathVariable Long id, @RequestBody PaymentApplication entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
