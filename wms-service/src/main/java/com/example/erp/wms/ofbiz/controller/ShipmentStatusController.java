package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ShipmentStatus;
import com.example.erp.wms.ofbiz.service.ShipmentStatusService;
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
@RequestMapping("/ofbiz/shipment-statuses")
public class ShipmentStatusController {

    private final ShipmentStatusService service;

    public ShipmentStatusController(ShipmentStatusService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentStatus> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentStatus get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentStatus> create(@RequestBody ShipmentStatus entity) {
        ShipmentStatus created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentStatus update(@PathVariable Long id, @RequestBody ShipmentStatus entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}