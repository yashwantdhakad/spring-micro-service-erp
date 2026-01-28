package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.Able015Inventory;
import com.monash.erp.wms.service.Able015InventoryService;
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
@RequestMapping("/api/able015-inventories")
public class Able015InventoryController {

    private final Able015InventoryService service;

    public Able015InventoryController(Able015InventoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Able015Inventory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Able015Inventory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Able015Inventory> create(@RequestBody Able015Inventory entity) {
        Able015Inventory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Able015Inventory update(@PathVariable Long id, @RequestBody Able015Inventory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}