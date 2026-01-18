package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentGatewayDhl;
import com.monash.erp.wms.service.ShipmentGatewayDhlService;
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
@RequestMapping("/api/shipment-gateway-dhls")
public class ShipmentGatewayDhlController {

    private final ShipmentGatewayDhlService service;

    public ShipmentGatewayDhlController(ShipmentGatewayDhlService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentGatewayDhl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentGatewayDhl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentGatewayDhl> create(@RequestBody ShipmentGatewayDhl entity) {
        ShipmentGatewayDhl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentGatewayDhl update(@PathVariable Long id, @RequestBody ShipmentGatewayDhl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}