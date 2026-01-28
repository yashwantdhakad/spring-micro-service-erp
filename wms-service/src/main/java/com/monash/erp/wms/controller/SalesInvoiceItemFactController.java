package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SalesInvoiceItemFact;
import com.monash.erp.wms.service.SalesInvoiceItemFactService;
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
@RequestMapping("/api/sales-invoice-item-facts")
public class SalesInvoiceItemFactController {

    private final SalesInvoiceItemFactService service;

    public SalesInvoiceItemFactController(SalesInvoiceItemFactService service) {
        this.service = service;
    }

    @GetMapping
    public List<SalesInvoiceItemFact> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SalesInvoiceItemFact get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SalesInvoiceItemFact> create(@RequestBody SalesInvoiceItemFact entity) {
        SalesInvoiceItemFact created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SalesInvoiceItemFact update(@PathVariable Long id, @RequestBody SalesInvoiceItemFact entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}