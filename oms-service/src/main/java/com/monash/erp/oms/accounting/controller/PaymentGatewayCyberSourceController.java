package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGatewayCyberSource;
import com.monash.erp.oms.accounting.service.PaymentGatewayCyberSourceService;
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
@RequestMapping("/api/accounting/payment-gateway-cyber-sources")
public class PaymentGatewayCyberSourceController {

    private final PaymentGatewayCyberSourceService service;

    public PaymentGatewayCyberSourceController(PaymentGatewayCyberSourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGatewayCyberSource> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGatewayCyberSource get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGatewayCyberSource> create(@RequestBody PaymentGatewayCyberSource entity) {
        PaymentGatewayCyberSource created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGatewayCyberSource update(@PathVariable Long id, @RequestBody PaymentGatewayCyberSource entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
