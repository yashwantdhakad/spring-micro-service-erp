package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.InvoiceType;
import com.monash.erp.oms.accounting.service.InvoiceTypeService;
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
@RequestMapping("/api/accounting/invoice-types")
public class InvoiceTypeController {

    private final InvoiceTypeService service;

    public InvoiceTypeController(InvoiceTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InvoiceType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InvoiceType> create(@RequestBody InvoiceType entity) {
        InvoiceType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InvoiceType update(@PathVariable Long id, @RequestBody InvoiceType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
