package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryCountVariance;
import com.monash.erp.wms.service.InventoryCountVarianceService;
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
@RequestMapping("/api/inventory-count-variances")
public class InventoryCountVarianceController {

    private final InventoryCountVarianceService service;

    public InventoryCountVarianceController(InventoryCountVarianceService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryCountVariance> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryCountVariance get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryCountVariance> create(@RequestBody InventoryCountVariance entity) {
        InventoryCountVariance created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryCountVariance update(@PathVariable Long id, @RequestBody InventoryCountVariance entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}