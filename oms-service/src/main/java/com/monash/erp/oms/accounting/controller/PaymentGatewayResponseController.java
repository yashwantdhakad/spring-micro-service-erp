package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGatewayResponse;
import com.monash.erp.oms.accounting.service.PaymentGatewayResponseService;
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
@RequestMapping("/accounting/payment-gateway-responses")
public class PaymentGatewayResponseController {

    private final PaymentGatewayResponseService service;

    public PaymentGatewayResponseController(PaymentGatewayResponseService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGatewayResponse> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGatewayResponse get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGatewayResponse> create(@RequestBody PaymentGatewayResponse entity) {
        PaymentGatewayResponse created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGatewayResponse update(@PathVariable Long id, @RequestBody PaymentGatewayResponse entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
