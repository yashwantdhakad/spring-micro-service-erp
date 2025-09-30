package com.example.erp.wms.controller;

import com.example.erp.wms.domain.InventoryItem;
import com.example.erp.wms.service.InventoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventoryItem> listInventory() {
        return service.list();
    }

    @GetMapping("/{id}")
    public InventoryItem getInventory(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/sku/{sku}")
    public InventoryItem getBySku(@PathVariable String sku) {
        return service.getBySku(sku);
    }

    @PostMapping
    public ResponseEntity<InventoryItem> create(@Valid @RequestBody InventoryItem item) {
        item.setId(null);
        InventoryItem created = service.create(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public InventoryItem update(@PathVariable Long id, @Valid @RequestBody InventoryItem item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
