package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentGatewayConfig;
import com.monash.erp.wms.service.ShipmentGatewayConfigService;
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
@RequestMapping("/ofbiz/shipment-gateway-configs")
public class ShipmentGatewayConfigController {

    private final ShipmentGatewayConfigService service;

    public ShipmentGatewayConfigController(ShipmentGatewayConfigService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentGatewayConfig> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentGatewayConfig get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentGatewayConfig> create(@RequestBody ShipmentGatewayConfig entity) {
        ShipmentGatewayConfig created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentGatewayConfig update(@PathVariable Long id, @RequestBody ShipmentGatewayConfig entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}