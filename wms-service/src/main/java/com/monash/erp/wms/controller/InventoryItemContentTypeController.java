package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryItemContentType;
import com.monash.erp.wms.service.InventoryItemContentTypeService;
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
@RequestMapping("/api/inventory-item-content-types")
public class InventoryItemContentTypeController {

    private final InventoryItemContentTypeService service;

    public InventoryItemContentTypeController(InventoryItemContentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItemContentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItemContentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryItemContentType> create(@RequestBody InventoryItemContentType entity) {
        InventoryItemContentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItemContentType update(@PathVariable Long id, @RequestBody InventoryItemContentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}