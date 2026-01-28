package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryCount;
import com.monash.erp.wms.service.InventoryCountService;
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
@RequestMapping("/api/inventory-counts")
public class InventoryCountController {

    private final InventoryCountService service;

    public InventoryCountController(InventoryCountService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryCount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryCount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryCount> create(@RequestBody InventoryCount entity) {
        InventoryCount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryCount update(@PathVariable Long id, @RequestBody InventoryCount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}