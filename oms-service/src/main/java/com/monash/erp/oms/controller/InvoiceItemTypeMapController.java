package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.InvoiceItemTypeMap;
import com.monash.erp.oms.service.InvoiceItemTypeMapService;
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
@RequestMapping("/api/invoice-item-type-maps")
public class InvoiceItemTypeMapController {

    private final InvoiceItemTypeMapService service;

    public InvoiceItemTypeMapController(InvoiceItemTypeMapService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceItemTypeMap> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InvoiceItemTypeMap get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InvoiceItemTypeMap> create(@RequestBody InvoiceItemTypeMap entity) {
        InvoiceItemTypeMap created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InvoiceItemTypeMap update(@PathVariable Long id, @RequestBody InvoiceItemTypeMap entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}