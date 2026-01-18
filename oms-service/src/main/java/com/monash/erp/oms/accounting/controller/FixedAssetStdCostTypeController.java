package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FixedAssetStdCostType;
import com.monash.erp.oms.accounting.service.FixedAssetStdCostTypeService;
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
@RequestMapping("/accounting/fixed-asset-std-cost-types")
public class FixedAssetStdCostTypeController {

    private final FixedAssetStdCostTypeService service;

    public FixedAssetStdCostTypeController(FixedAssetStdCostTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetStdCostType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetStdCostType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetStdCostType> create(@RequestBody FixedAssetStdCostType entity) {
        FixedAssetStdCostType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetStdCostType update(@PathVariable Long id, @RequestBody FixedAssetStdCostType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
