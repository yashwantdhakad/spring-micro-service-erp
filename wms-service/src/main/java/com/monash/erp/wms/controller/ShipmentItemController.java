package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentItem;
import com.monash.erp.wms.service.ShipmentItemService;
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
@RequestMapping("/api/shipment-items")
public class ShipmentItemController {

    private final ShipmentItemService service;

    public ShipmentItemController(ShipmentItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentItem> create(@RequestBody ShipmentItem entity) {
        ShipmentItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentItem update(@PathVariable Long id, @RequestBody ShipmentItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}