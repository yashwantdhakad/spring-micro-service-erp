package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FixedAssetMaintMeter;
import com.monash.erp.wms.service.FixedAssetMaintMeterService;
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
@RequestMapping("/api/fixed-asset-maint-meters")
public class FixedAssetMaintMeterController {

    private final FixedAssetMaintMeterService service;

    public FixedAssetMaintMeterController(FixedAssetMaintMeterService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetMaintMeter> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetMaintMeter get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetMaintMeter> create(@RequestBody FixedAssetMaintMeter entity) {
        FixedAssetMaintMeter created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetMaintMeter update(@PathVariable Long id, @RequestBody FixedAssetMaintMeter entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}