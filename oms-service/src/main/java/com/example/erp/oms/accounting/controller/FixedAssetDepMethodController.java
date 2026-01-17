package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.FixedAssetDepMethod;
import com.example.erp.oms.accounting.service.FixedAssetDepMethodService;
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
@RequestMapping("/accounting/fixed-asset-dep-methods")
public class FixedAssetDepMethodController {

    private final FixedAssetDepMethodService service;

    public FixedAssetDepMethodController(FixedAssetDepMethodService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetDepMethod> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetDepMethod get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetDepMethod> create(@RequestBody FixedAssetDepMethod entity) {
        FixedAssetDepMethod created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetDepMethod update(@PathVariable Long id, @RequestBody FixedAssetDepMethod entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
