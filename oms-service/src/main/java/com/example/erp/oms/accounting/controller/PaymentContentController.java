package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.PaymentContent;
import com.example.erp.oms.accounting.service.PaymentContentService;
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
@RequestMapping("/accounting/payment-contents")
public class PaymentContentController {

    private final PaymentContentService service;

    public PaymentContentController(PaymentContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentContent> create(@RequestBody PaymentContent entity) {
        PaymentContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentContent update(@PathVariable Long id, @RequestBody PaymentContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
