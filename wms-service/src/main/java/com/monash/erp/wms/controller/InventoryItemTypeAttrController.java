package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryItemTypeAttr;
import com.monash.erp.wms.service.InventoryItemTypeAttrService;
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
@RequestMapping("/api/inventory-item-type-attrs")
public class InventoryItemTypeAttrController {

    private final InventoryItemTypeAttrService service;

    public InventoryItemTypeAttrController(InventoryItemTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItemTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItemTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryItemTypeAttr> create(@RequestBody InventoryItemTypeAttr entity) {
        InventoryItemTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItemTypeAttr update(@PathVariable Long id, @RequestBody InventoryItemTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}