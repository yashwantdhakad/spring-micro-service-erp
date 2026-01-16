package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ShipmentContactMech;
import com.example.erp.wms.ofbiz.service.ShipmentContactMechService;
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
@RequestMapping("/ofbiz/shipment-contact-mechs")
public class ShipmentContactMechController {

    private final ShipmentContactMechService service;

    public ShipmentContactMechController(ShipmentContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentContactMech> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentContactMech> create(@RequestBody ShipmentContactMech entity) {
        ShipmentContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentContactMech update(@PathVariable Long id, @RequestBody ShipmentContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}