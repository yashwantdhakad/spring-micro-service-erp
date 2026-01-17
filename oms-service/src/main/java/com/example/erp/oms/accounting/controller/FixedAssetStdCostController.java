package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.FixedAssetStdCost;
import com.example.erp.oms.accounting.service.FixedAssetStdCostService;
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
@RequestMapping("/accounting/fixed-asset-std-costs")
public class FixedAssetStdCostController {

    private final FixedAssetStdCostService service;

    public FixedAssetStdCostController(FixedAssetStdCostService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetStdCost> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetStdCost get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetStdCost> create(@RequestBody FixedAssetStdCost entity) {
        FixedAssetStdCost created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetStdCost update(@PathVariable Long id, @RequestBody FixedAssetStdCost entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
