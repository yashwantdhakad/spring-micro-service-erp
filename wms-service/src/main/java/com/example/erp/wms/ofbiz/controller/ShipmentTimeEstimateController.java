package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ShipmentTimeEstimate;
import com.example.erp.wms.ofbiz.service.ShipmentTimeEstimateService;
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
@RequestMapping("/ofbiz/shipment-time-estimates")
public class ShipmentTimeEstimateController {

    private final ShipmentTimeEstimateService service;

    public ShipmentTimeEstimateController(ShipmentTimeEstimateService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentTimeEstimate> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentTimeEstimate get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentTimeEstimate> create(@RequestBody ShipmentTimeEstimate entity) {
        ShipmentTimeEstimate created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentTimeEstimate update(@PathVariable Long id, @RequestBody ShipmentTimeEstimate entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}