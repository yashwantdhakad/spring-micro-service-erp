package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGatewayPayflowPro;
import com.monash.erp.oms.accounting.service.PaymentGatewayPayflowProService;
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
@RequestMapping("/accounting/payment-gateway-payflow-pros")
public class PaymentGatewayPayflowProController {

    private final PaymentGatewayPayflowProService service;

    public PaymentGatewayPayflowProController(PaymentGatewayPayflowProService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGatewayPayflowPro> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGatewayPayflowPro get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGatewayPayflowPro> create(@RequestBody PaymentGatewayPayflowPro entity) {
        PaymentGatewayPayflowPro created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGatewayPayflowPro update(@PathVariable Long id, @RequestBody PaymentGatewayPayflowPro entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
