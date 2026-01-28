package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryItemFact;
import com.monash.erp.wms.service.InventoryItemFactService;
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
@RequestMapping("/api/inventory-item-facts")
public class InventoryItemFactController {

    private final InventoryItemFactService service;

    public InventoryItemFactController(InventoryItemFactService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItemFact> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItemFact get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryItemFact> create(@RequestBody InventoryItemFact entity) {
        InventoryItemFact created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItemFact update(@PathVariable Long id, @RequestBody InventoryItemFact entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}