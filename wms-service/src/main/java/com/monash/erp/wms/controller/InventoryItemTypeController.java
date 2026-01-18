package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryItemType;
import com.monash.erp.wms.service.InventoryItemTypeService;
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
@RequestMapping("/api/inventory-item-types")
public class InventoryItemTypeController {

    private final InventoryItemTypeService service;

    public InventoryItemTypeController(InventoryItemTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItemType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItemType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryItemType> create(@RequestBody InventoryItemType entity) {
        InventoryItemType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItemType update(@PathVariable Long id, @RequestBody InventoryItemType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}