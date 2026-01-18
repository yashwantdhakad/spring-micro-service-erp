package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.InvoiceItemAssoc;
import com.monash.erp.oms.accounting.service.InvoiceItemAssocService;
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
@RequestMapping("/api/accounting/invoice-item-assocs")
public class InvoiceItemAssocController {

    private final InvoiceItemAssocService service;

    public InvoiceItemAssocController(InvoiceItemAssocService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceItemAssoc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InvoiceItemAssoc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InvoiceItemAssoc> create(@RequestBody InvoiceItemAssoc entity) {
        InvoiceItemAssoc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InvoiceItemAssoc update(@PathVariable Long id, @RequestBody InvoiceItemAssoc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
