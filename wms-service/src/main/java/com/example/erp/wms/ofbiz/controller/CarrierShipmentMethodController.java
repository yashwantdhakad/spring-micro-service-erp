package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.CarrierShipmentMethod;
import com.example.erp.wms.ofbiz.service.CarrierShipmentMethodService;
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
@RequestMapping("/ofbiz/carrier-shipment-methods")
public class CarrierShipmentMethodController {

    private final CarrierShipmentMethodService service;

    public CarrierShipmentMethodController(CarrierShipmentMethodService service) {
        this.service = service;
    }

    @GetMapping
    public List<CarrierShipmentMethod> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CarrierShipmentMethod get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CarrierShipmentMethod> create(@RequestBody CarrierShipmentMethod entity) {
        CarrierShipmentMethod created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CarrierShipmentMethod update(@PathVariable Long id, @RequestBody CarrierShipmentMethod entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}