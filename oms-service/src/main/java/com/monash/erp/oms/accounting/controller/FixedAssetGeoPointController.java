package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FixedAssetGeoPoint;
import com.monash.erp.oms.accounting.service.FixedAssetGeoPointService;
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
@RequestMapping("/api/accounting/fixed-asset-geo-points")
public class FixedAssetGeoPointController {

    private final FixedAssetGeoPointService service;

    public FixedAssetGeoPointController(FixedAssetGeoPointService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetGeoPoint> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetGeoPoint get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetGeoPoint> create(@RequestBody FixedAssetGeoPoint entity) {
        FixedAssetGeoPoint created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetGeoPoint update(@PathVariable Long id, @RequestBody FixedAssetGeoPoint entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
