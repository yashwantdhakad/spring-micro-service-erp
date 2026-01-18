package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGatewaySagePay;
import com.monash.erp.oms.accounting.service.PaymentGatewaySagePayService;
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
@RequestMapping("/api/accounting/payment-gateway-sage-pays")
public class PaymentGatewaySagePayController {

    private final PaymentGatewaySagePayService service;

    public PaymentGatewaySagePayController(PaymentGatewaySagePayService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGatewaySagePay> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGatewaySagePay get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGatewaySagePay> create(@RequestBody PaymentGatewaySagePay entity) {
        PaymentGatewaySagePay created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGatewaySagePay update(@PathVariable Long id, @RequestBody PaymentGatewaySagePay entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
