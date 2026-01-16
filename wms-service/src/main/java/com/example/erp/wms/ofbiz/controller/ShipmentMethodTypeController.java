package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ShipmentMethodType;
import com.example.erp.wms.ofbiz.service.ShipmentMethodTypeService;
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
@RequestMapping("/ofbiz/shipment-method-types")
public class ShipmentMethodTypeController {

    private final ShipmentMethodTypeService service;

    public ShipmentMethodTypeController(ShipmentMethodTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentMethodType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentMethodType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentMethodType> create(@RequestBody ShipmentMethodType entity) {
        ShipmentMethodType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentMethodType update(@PathVariable Long id, @RequestBody ShipmentMethodType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}