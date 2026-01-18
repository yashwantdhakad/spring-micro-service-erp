package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentPackageRouteSeg;
import com.monash.erp.wms.service.ShipmentPackageRouteSegService;
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
@RequestMapping("/api/shipment-package-route-segs")
public class ShipmentPackageRouteSegController {

    private final ShipmentPackageRouteSegService service;

    public ShipmentPackageRouteSegController(ShipmentPackageRouteSegService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentPackageRouteSeg> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentPackageRouteSeg get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentPackageRouteSeg> create(@RequestBody ShipmentPackageRouteSeg entity) {
        ShipmentPackageRouteSeg created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentPackageRouteSeg update(@PathVariable Long id, @RequestBody ShipmentPackageRouteSeg entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}