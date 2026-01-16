package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ShipmentRouteSegment;
import com.example.erp.wms.ofbiz.service.ShipmentRouteSegmentService;
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
@RequestMapping("/ofbiz/shipment-route-segments")
public class ShipmentRouteSegmentController {

    private final ShipmentRouteSegmentService service;

    public ShipmentRouteSegmentController(ShipmentRouteSegmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentRouteSegment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentRouteSegment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentRouteSegment> create(@RequestBody ShipmentRouteSegment entity) {
        ShipmentRouteSegment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentRouteSegment update(@PathVariable Long id, @RequestBody ShipmentRouteSegment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}