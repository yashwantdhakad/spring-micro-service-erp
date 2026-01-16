package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.Shipment;
import com.example.erp.wms.ofbiz.service.ShipmentService;
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
@RequestMapping("/ofbiz/shipments")
public class ShipmentController {

    private final ShipmentService service;

    public ShipmentController(ShipmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Shipment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Shipment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Shipment> create(@RequestBody Shipment entity) {
        Shipment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Shipment update(@PathVariable Long id, @RequestBody Shipment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}