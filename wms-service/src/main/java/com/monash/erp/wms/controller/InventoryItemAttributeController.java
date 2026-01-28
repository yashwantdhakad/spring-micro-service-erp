package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryItemAttribute;
import com.monash.erp.wms.service.InventoryItemAttributeService;
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
@RequestMapping("/api/inventory-item-attributes")
public class InventoryItemAttributeController {

    private final InventoryItemAttributeService service;

    public InventoryItemAttributeController(InventoryItemAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItemAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItemAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryItemAttribute> create(@RequestBody InventoryItemAttribute entity) {
        InventoryItemAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItemAttribute update(@PathVariable Long id, @RequestBody InventoryItemAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}