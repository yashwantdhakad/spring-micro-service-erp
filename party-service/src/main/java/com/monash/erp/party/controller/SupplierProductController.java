package com.monash.erp.party.controller;

import com.monash.erp.party.entity.SupplierProduct;
import com.monash.erp.party.service.SupplierProductService;
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
@RequestMapping("/api/supplier-products")
public class SupplierProductController {

    private final SupplierProductService service;

    public SupplierProductController(SupplierProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<SupplierProduct> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SupplierProduct get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SupplierProduct> create(@RequestBody SupplierProduct entity) {
        SupplierProduct created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SupplierProduct update(@PathVariable Long id, @RequestBody SupplierProduct entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}