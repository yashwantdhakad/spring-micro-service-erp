package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ShipmentContactMechType;
import com.example.erp.wms.ofbiz.service.ShipmentContactMechTypeService;
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
@RequestMapping("/ofbiz/shipment-contact-mech-types")
public class ShipmentContactMechTypeController {

    private final ShipmentContactMechTypeService service;

    public ShipmentContactMechTypeController(ShipmentContactMechTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentContactMechType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentContactMechType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentContactMechType> create(@RequestBody ShipmentContactMechType entity) {
        ShipmentContactMechType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentContactMechType update(@PathVariable Long id, @RequestBody ShipmentContactMechType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}