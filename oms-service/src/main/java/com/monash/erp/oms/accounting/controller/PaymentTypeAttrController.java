package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentTypeAttr;
import com.monash.erp.oms.accounting.service.PaymentTypeAttrService;
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
@RequestMapping("/api/accounting/payment-type-attrs")
public class PaymentTypeAttrController {

    private final PaymentTypeAttrService service;

    public PaymentTypeAttrController(PaymentTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentTypeAttr> create(@RequestBody PaymentTypeAttr entity) {
        PaymentTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentTypeAttr update(@PathVariable Long id, @RequestBody PaymentTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
