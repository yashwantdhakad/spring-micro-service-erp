package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentGatewayFieldMapping;
import com.monash.erp.wms.service.ShipmentGatewayFieldMappingService;
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
@RequestMapping("/api/shipment-gateway-field-mappings")
public class ShipmentGatewayFieldMappingController {

    private final ShipmentGatewayFieldMappingService service;

    public ShipmentGatewayFieldMappingController(ShipmentGatewayFieldMappingService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentGatewayFieldMapping> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentGatewayFieldMapping get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentGatewayFieldMapping> create(@RequestBody ShipmentGatewayFieldMapping entity) {
        ShipmentGatewayFieldMapping created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentGatewayFieldMapping update(@PathVariable Long id, @RequestBody ShipmentGatewayFieldMapping entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}