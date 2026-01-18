package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.InvoiceItemTypeGlAccount;
import com.monash.erp.oms.accounting.service.InvoiceItemTypeGlAccountService;
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
@RequestMapping("/api/accounting/invoice-item-type-gl-accounts")
public class InvoiceItemTypeGlAccountController {

    private final InvoiceItemTypeGlAccountService service;

    public InvoiceItemTypeGlAccountController(InvoiceItemTypeGlAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceItemTypeGlAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InvoiceItemTypeGlAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InvoiceItemTypeGlAccount> create(@RequestBody InvoiceItemTypeGlAccount entity) {
        InvoiceItemTypeGlAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InvoiceItemTypeGlAccount update(@PathVariable Long id, @RequestBody InvoiceItemTypeGlAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
