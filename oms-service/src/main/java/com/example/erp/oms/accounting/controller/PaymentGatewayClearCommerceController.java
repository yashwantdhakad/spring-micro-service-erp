package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.PaymentGatewayClearCommerce;
import com.example.erp.oms.accounting.service.PaymentGatewayClearCommerceService;
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
@RequestMapping("/accounting/payment-gateway-clear-commerces")
public class PaymentGatewayClearCommerceController {

    private final PaymentGatewayClearCommerceService service;

    public PaymentGatewayClearCommerceController(PaymentGatewayClearCommerceService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGatewayClearCommerce> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGatewayClearCommerce get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGatewayClearCommerce> create(@RequestBody PaymentGatewayClearCommerce entity) {
        PaymentGatewayClearCommerce created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGatewayClearCommerce update(@PathVariable Long id, @RequestBody PaymentGatewayClearCommerce entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
