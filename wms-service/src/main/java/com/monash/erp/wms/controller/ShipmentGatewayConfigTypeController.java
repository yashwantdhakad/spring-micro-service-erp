package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentGatewayConfigType;
import com.monash.erp.wms.service.ShipmentGatewayConfigTypeService;
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
@RequestMapping("/api/shipment-gateway-config-types")
public class ShipmentGatewayConfigTypeController {

    private final ShipmentGatewayConfigTypeService service;

    public ShipmentGatewayConfigTypeController(ShipmentGatewayConfigTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentGatewayConfigType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentGatewayConfigType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentGatewayConfigType> create(@RequestBody ShipmentGatewayConfigType entity) {
        ShipmentGatewayConfigType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentGatewayConfigType update(@PathVariable Long id, @RequestBody ShipmentGatewayConfigType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}