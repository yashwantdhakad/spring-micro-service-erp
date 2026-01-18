package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentType;
import com.monash.erp.wms.service.ShipmentTypeService;
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
@RequestMapping("/api/shipment-types")
public class ShipmentTypeController {

    private final ShipmentTypeService service;

    public ShipmentTypeController(ShipmentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentType> create(@RequestBody ShipmentType entity) {
        ShipmentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentType update(@PathVariable Long id, @RequestBody ShipmentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}