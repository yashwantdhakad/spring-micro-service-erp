package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.PhysicalInventory;
import com.example.erp.wms.ofbiz.service.PhysicalInventoryService;
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
@RequestMapping("/ofbiz/physical-inventories")
public class PhysicalInventoryController {

    private final PhysicalInventoryService service;

    public PhysicalInventoryController(PhysicalInventoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<PhysicalInventory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PhysicalInventory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PhysicalInventory> create(@RequestBody PhysicalInventory entity) {
        PhysicalInventory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PhysicalInventory update(@PathVariable Long id, @RequestBody PhysicalInventory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}