package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGatewayPayPal;
import com.monash.erp.oms.accounting.service.PaymentGatewayPayPalService;
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
@RequestMapping("/api/accounting/payment-gateway-pay-pals")
public class PaymentGatewayPayPalController {

    private final PaymentGatewayPayPalService service;

    public PaymentGatewayPayPalController(PaymentGatewayPayPalService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGatewayPayPal> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGatewayPayPal get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGatewayPayPal> create(@RequestBody PaymentGatewayPayPal entity) {
        PaymentGatewayPayPal created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGatewayPayPal update(@PathVariable Long id, @RequestBody PaymentGatewayPayPal entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
