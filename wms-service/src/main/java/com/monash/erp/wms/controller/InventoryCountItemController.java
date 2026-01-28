package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.InventoryCountItem;
import com.monash.erp.wms.service.InventoryCountItemService;
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
@RequestMapping("/api/inventory-count-items")
public class InventoryCountItemController {

    private final InventoryCountItemService service;

    public InventoryCountItemController(InventoryCountItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryCountItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryCountItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<InventoryCountItem> create(@RequestBody InventoryCountItem entity) {
        InventoryCountItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryCountItem update(@PathVariable Long id, @RequestBody InventoryCountItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}