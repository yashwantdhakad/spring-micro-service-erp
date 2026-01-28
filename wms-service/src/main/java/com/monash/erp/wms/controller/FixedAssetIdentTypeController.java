package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FixedAssetIdentType;
import com.monash.erp.wms.service.FixedAssetIdentTypeService;
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
@RequestMapping("/api/fixed-asset-ident-types")
public class FixedAssetIdentTypeController {

    private final FixedAssetIdentTypeService service;

    public FixedAssetIdentTypeController(FixedAssetIdentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetIdentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetIdentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetIdentType> create(@RequestBody FixedAssetIdentType entity) {
        FixedAssetIdentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetIdentType update(@PathVariable Long id, @RequestBody FixedAssetIdentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}