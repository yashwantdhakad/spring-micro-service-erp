package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.BillingAccountRole;
import com.example.erp.oms.accounting.service.BillingAccountRoleService;
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
@RequestMapping("/accounting/billing-account-roles")
public class BillingAccountRoleController {

    private final BillingAccountRoleService service;

    public BillingAccountRoleController(BillingAccountRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<BillingAccountRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BillingAccountRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BillingAccountRole> create(@RequestBody BillingAccountRole entity) {
        BillingAccountRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BillingAccountRole update(@PathVariable Long id, @RequestBody BillingAccountRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
