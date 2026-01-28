package com.monash.erp.party.controller;

import com.monash.erp.party.entity.SupplierProductFeature;
import com.monash.erp.party.service.SupplierProductFeatureService;
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
@RequestMapping("/api/supplier-product-features")
public class SupplierProductFeatureController {

    private final SupplierProductFeatureService service;

    public SupplierProductFeatureController(SupplierProductFeatureService service) {
        this.service = service;
    }

    @GetMapping
    public List<SupplierProductFeature> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SupplierProductFeature get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SupplierProductFeature> create(@RequestBody SupplierProductFeature entity) {
        SupplierProductFeature created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SupplierProductFeature update(@PathVariable Long id, @RequestBody SupplierProductFeature entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}