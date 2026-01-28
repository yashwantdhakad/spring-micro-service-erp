package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FixedAssetAttribute;
import com.monash.erp.wms.service.FixedAssetAttributeService;
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
@RequestMapping("/api/fixed-asset-attributes")
public class FixedAssetAttributeController {

    private final FixedAssetAttributeService service;

    public FixedAssetAttributeController(FixedAssetAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetAttribute> create(@RequestBody FixedAssetAttribute entity) {
        FixedAssetAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetAttribute update(@PathVariable Long id, @RequestBody FixedAssetAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}