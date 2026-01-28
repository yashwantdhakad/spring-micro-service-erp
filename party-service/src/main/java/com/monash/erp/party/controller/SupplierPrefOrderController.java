package com.monash.erp.party.controller;

import com.monash.erp.party.entity.SupplierPrefOrder;
import com.monash.erp.party.service.SupplierPrefOrderService;
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
@RequestMapping("/api/supplier-pref-orders")
public class SupplierPrefOrderController {

    private final SupplierPrefOrderService service;

    public SupplierPrefOrderController(SupplierPrefOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<SupplierPrefOrder> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SupplierPrefOrder get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SupplierPrefOrder> create(@RequestBody SupplierPrefOrder entity) {
        SupplierPrefOrder created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SupplierPrefOrder update(@PathVariable Long id, @RequestBody SupplierPrefOrder entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}