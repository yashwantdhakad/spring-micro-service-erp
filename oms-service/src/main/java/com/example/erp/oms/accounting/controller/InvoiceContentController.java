package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.InvoiceContent;
import com.example.erp.oms.accounting.service.InvoiceContentService;
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
@RequestMapping("/accounting/invoice-contents")
public class InvoiceContentController {

    private final InvoiceContentService service;

    public InvoiceContentController(InvoiceContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InvoiceContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InvoiceContent> create(@RequestBody InvoiceContent entity) {
        InvoiceContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InvoiceContent update(@PathVariable Long id, @RequestBody InvoiceContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
