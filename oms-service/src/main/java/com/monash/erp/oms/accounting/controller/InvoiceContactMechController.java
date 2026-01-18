package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.InvoiceContactMech;
import com.monash.erp.oms.accounting.service.InvoiceContactMechService;
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
@RequestMapping("/api/accounting/invoice-contact-mechs")
public class InvoiceContactMechController {

    private final InvoiceContactMechService service;

    public InvoiceContactMechController(InvoiceContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceContactMech> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InvoiceContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InvoiceContactMech> create(@RequestBody InvoiceContactMech entity) {
        InvoiceContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InvoiceContactMech update(@PathVariable Long id, @RequestBody InvoiceContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
