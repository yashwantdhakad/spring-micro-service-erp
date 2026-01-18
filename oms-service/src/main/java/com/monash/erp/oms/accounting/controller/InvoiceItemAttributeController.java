package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.InvoiceItemAttribute;
import com.monash.erp.oms.accounting.service.InvoiceItemAttributeService;
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
@RequestMapping("/accounting/invoice-item-attributes")
public class InvoiceItemAttributeController {

    private final InvoiceItemAttributeService service;

    public InvoiceItemAttributeController(InvoiceItemAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceItemAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InvoiceItemAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InvoiceItemAttribute> create(@RequestBody InvoiceItemAttribute entity) {
        InvoiceItemAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InvoiceItemAttribute update(@PathVariable Long id, @RequestBody InvoiceItemAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
