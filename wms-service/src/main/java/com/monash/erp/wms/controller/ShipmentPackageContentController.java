package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShipmentPackageContent;
import com.monash.erp.wms.service.ShipmentPackageContentService;
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
@RequestMapping("/api/shipment-package-contents")
public class ShipmentPackageContentController {

    private final ShipmentPackageContentService service;

    public ShipmentPackageContentController(ShipmentPackageContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentPackageContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentPackageContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentPackageContent> create(@RequestBody ShipmentPackageContent entity) {
        ShipmentPackageContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentPackageContent update(@PathVariable Long id, @RequestBody ShipmentPackageContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}