package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FixedAssetMeter;
import com.monash.erp.oms.accounting.service.FixedAssetMeterService;
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
@RequestMapping("/accounting/fixed-asset-meters")
public class FixedAssetMeterController {

    private final FixedAssetMeterService service;

    public FixedAssetMeterController(FixedAssetMeterService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetMeter> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetMeter get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetMeter> create(@RequestBody FixedAssetMeter entity) {
        FixedAssetMeter created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetMeter update(@PathVariable Long id, @RequestBody FixedAssetMeter entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
