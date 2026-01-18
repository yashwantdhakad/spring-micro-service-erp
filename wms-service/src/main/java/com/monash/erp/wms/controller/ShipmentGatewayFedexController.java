package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentGatewayFedex;
import com.monash.erp.wms.service.ShipmentGatewayFedexService;
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
@RequestMapping("/api/shipment-gateway-fedexs")
public class ShipmentGatewayFedexController {

    private final ShipmentGatewayFedexService service;

    public ShipmentGatewayFedexController(ShipmentGatewayFedexService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentGatewayFedex> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentGatewayFedex get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentGatewayFedex> create(@RequestBody ShipmentGatewayFedex entity) {
        ShipmentGatewayFedex created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentGatewayFedex update(@PathVariable Long id, @RequestBody ShipmentGatewayFedex entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}