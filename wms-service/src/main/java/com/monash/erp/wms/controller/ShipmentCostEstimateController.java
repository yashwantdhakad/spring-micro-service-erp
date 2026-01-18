package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentCostEstimate;
import com.monash.erp.wms.service.ShipmentCostEstimateService;
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
@RequestMapping("/ofbiz/shipment-cost-estimates")
public class ShipmentCostEstimateController {

    private final ShipmentCostEstimateService service;

    public ShipmentCostEstimateController(ShipmentCostEstimateService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentCostEstimate> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentCostEstimate get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentCostEstimate> create(@RequestBody ShipmentCostEstimate entity) {
        ShipmentCostEstimate created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentCostEstimate update(@PathVariable Long id, @RequestBody ShipmentCostEstimate entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}