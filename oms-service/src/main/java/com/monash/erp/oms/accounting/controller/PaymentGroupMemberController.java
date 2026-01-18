package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.PaymentGroupMember;
import com.monash.erp.oms.accounting.service.PaymentGroupMemberService;
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
@RequestMapping("/accounting/payment-group-members")
public class PaymentGroupMemberController {

    private final PaymentGroupMemberService service;

    public PaymentGroupMemberController(PaymentGroupMemberService service) {
        this.service = service;
    }

    @GetMapping
    public List<PaymentGroupMember> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PaymentGroupMember get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PaymentGroupMember> create(@RequestBody PaymentGroupMember entity) {
        PaymentGroupMember created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PaymentGroupMember update(@PathVariable Long id, @RequestBody PaymentGroupMember entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
