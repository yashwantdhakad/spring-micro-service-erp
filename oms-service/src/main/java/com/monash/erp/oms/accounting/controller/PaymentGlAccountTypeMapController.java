package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGlAccountTypeMap;
import com.monash.erp.oms.accounting.service.PaymentGlAccountTypeMapService;
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
@RequestMapping("/api/accounting/payment-gl-account-type-maps")
public class PaymentGlAccountTypeMapController {

    private final PaymentGlAccountTypeMapService service;

    public PaymentGlAccountTypeMapController(PaymentGlAccountTypeMapService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGlAccountTypeMap> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGlAccountTypeMap get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGlAccountTypeMap> create(@RequestBody PaymentGlAccountTypeMap entity) {
        PaymentGlAccountTypeMap created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGlAccountTypeMap update(@PathVariable Long id, @RequestBody PaymentGlAccountTypeMap entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
