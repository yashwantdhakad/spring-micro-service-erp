package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.InventoryItemVariance;
import com.example.erp.wms.ofbiz.service.InventoryItemVarianceService;
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
@RequestMapping("/ofbiz/inventory-item-variances")
public class InventoryItemVarianceController {

    private final InventoryItemVarianceService service;

    public InventoryItemVarianceController(InventoryItemVarianceService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItemVariance> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItemVariance get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryItemVariance> create(@RequestBody InventoryItemVariance entity) {
        InventoryItemVariance created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItemVariance update(@PathVariable Long id, @RequestBody InventoryItemVariance entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}