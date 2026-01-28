package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FixedAssetProductType;
import com.monash.erp.wms.service.FixedAssetProductTypeService;
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
@RequestMapping("/api/fixed-asset-product-types")
public class FixedAssetProductTypeController {

    private final FixedAssetProductTypeService service;

    public FixedAssetProductTypeController(FixedAssetProductTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetProductType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetProductType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetProductType> create(@RequestBody FixedAssetProductType entity) {
        FixedAssetProductType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetProductType update(@PathVariable Long id, @RequestBody FixedAssetProductType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}