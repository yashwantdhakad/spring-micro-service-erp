package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FixedAssetMaintOrder;
import com.monash.erp.oms.accounting.service.FixedAssetMaintOrderService;
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
@RequestMapping("/accounting/fixed-asset-maint-orders")
public class FixedAssetMaintOrderController {

    private final FixedAssetMaintOrderService service;

    public FixedAssetMaintOrderController(FixedAssetMaintOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetMaintOrder> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetMaintOrder get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetMaintOrder> create(@RequestBody FixedAssetMaintOrder entity) {
        FixedAssetMaintOrder created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetMaintOrder update(@PathVariable Long id, @RequestBody FixedAssetMaintOrder entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
