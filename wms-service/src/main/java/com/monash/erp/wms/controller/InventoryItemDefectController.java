package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryItemDefect;
import com.monash.erp.wms.service.InventoryItemDefectService;
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
@RequestMapping("/api/inventory-item-defects")
public class InventoryItemDefectController {

    private final InventoryItemDefectService service;

    public InventoryItemDefectController(InventoryItemDefectService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItemDefect> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItemDefect get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryItemDefect> create(@RequestBody InventoryItemDefect entity) {
        InventoryItemDefect created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItemDefect update(@PathVariable Long id, @RequestBody InventoryItemDefect entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}