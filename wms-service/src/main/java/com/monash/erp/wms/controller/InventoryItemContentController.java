package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryItemContent;
import com.monash.erp.wms.service.InventoryItemContentService;
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
@RequestMapping("/api/inventory-item-contents")
public class InventoryItemContentController {

    private final InventoryItemContentService service;

    public InventoryItemContentController(InventoryItemContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItemContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItemContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryItemContent> create(@RequestBody InventoryItemContent entity) {
        InventoryItemContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItemContent update(@PathVariable Long id, @RequestBody InventoryItemContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}