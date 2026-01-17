package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.PaymentGatewayConfigType;
import com.example.erp.oms.accounting.service.PaymentGatewayConfigTypeService;
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
@RequestMapping("/accounting/payment-gateway-config-types")
public class PaymentGatewayConfigTypeController {

    private final PaymentGatewayConfigTypeService service;

    public PaymentGatewayConfigTypeController(PaymentGatewayConfigTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGatewayConfigType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGatewayConfigType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGatewayConfigType> create(@RequestBody PaymentGatewayConfigType entity) {
        PaymentGatewayConfigType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGatewayConfigType update(@PathVariable Long id, @RequestBody PaymentGatewayConfigType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
