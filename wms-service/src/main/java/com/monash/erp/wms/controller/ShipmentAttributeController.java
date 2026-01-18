package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentAttribute;
import com.monash.erp.wms.service.ShipmentAttributeService;
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
@RequestMapping("/ofbiz/shipment-attributes")
public class ShipmentAttributeController {

    private final ShipmentAttributeService service;

    public ShipmentAttributeController(ShipmentAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentAttribute> create(@RequestBody ShipmentAttribute entity) {
        ShipmentAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentAttribute update(@PathVariable Long id, @RequestBody ShipmentAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}