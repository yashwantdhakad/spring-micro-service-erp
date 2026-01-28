package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.InvoiceItemType;
import com.monash.erp.oms.service.InvoiceItemTypeService;
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
@RequestMapping("/api/invoice-item-types")
public class InvoiceItemTypeController {

    private final InvoiceItemTypeService service;

    public InvoiceItemTypeController(InvoiceItemTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceItemType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InvoiceItemType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InvoiceItemType> create(@RequestBody InvoiceItemType entity) {
        InvoiceItemType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InvoiceItemType update(@PathVariable Long id, @RequestBody InvoiceItemType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}