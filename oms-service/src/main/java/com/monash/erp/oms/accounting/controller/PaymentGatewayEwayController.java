package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGatewayEway;
import com.monash.erp.oms.accounting.service.PaymentGatewayEwayService;
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
@RequestMapping("/api/accounting/payment-gateway-eways")
public class PaymentGatewayEwayController {

    private final PaymentGatewayEwayService service;

    public PaymentGatewayEwayController(PaymentGatewayEwayService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGatewayEway> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGatewayEway get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGatewayEway> create(@RequestBody PaymentGatewayEway entity) {
        PaymentGatewayEway created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGatewayEway update(@PathVariable Long id, @RequestBody PaymentGatewayEway entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
