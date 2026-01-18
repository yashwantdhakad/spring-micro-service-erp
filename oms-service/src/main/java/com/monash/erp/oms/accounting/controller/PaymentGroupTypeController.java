package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGroupType;
import com.monash.erp.oms.accounting.service.PaymentGroupTypeService;
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
@RequestMapping("/api/accounting/payment-group-types")
public class PaymentGroupTypeController {

    private final PaymentGroupTypeService service;

    public PaymentGroupTypeController(PaymentGroupTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGroupType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGroupType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGroupType> create(@RequestBody PaymentGroupType entity) {
        PaymentGroupType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGroupType update(@PathVariable Long id, @RequestBody PaymentGroupType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
