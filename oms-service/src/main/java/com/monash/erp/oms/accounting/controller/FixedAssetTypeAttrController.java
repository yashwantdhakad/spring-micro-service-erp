package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FixedAssetTypeAttr;
import com.monash.erp.oms.accounting.service.FixedAssetTypeAttrService;
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
@RequestMapping("/accounting/fixed-asset-type-attrs")
public class FixedAssetTypeAttrController {

    private final FixedAssetTypeAttrService service;

    public FixedAssetTypeAttrController(FixedAssetTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetTypeAttr> create(@RequestBody FixedAssetTypeAttr entity) {
        FixedAssetTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetTypeAttr update(@PathVariable Long id, @RequestBody FixedAssetTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
