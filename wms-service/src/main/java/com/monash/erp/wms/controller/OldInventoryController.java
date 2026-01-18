package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.OldInventoryItem;
import com.monash.erp.wms.service.OldInventoryService;
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
public class OldInventoryController {

    private final OldInventoryService service;

    public OldInventoryController(OldInventoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<OldInventoryItem> listInventory() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OldInventoryItem getInventory(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/sku/{sku}")
    public OldInventoryItem getBySku(@PathVariable String sku) {
        return service.getBySku(sku);
    }

    @PostMapping
    public ResponseEntity<OldInventoryItem> create(@Valid @RequestBody OldInventoryItem item) {
        item.setId(null);
        OldInventoryItem created = service.create(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OldInventoryItem update(@PathVariable Long id, @Valid @RequestBody OldInventoryItem item) {
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
