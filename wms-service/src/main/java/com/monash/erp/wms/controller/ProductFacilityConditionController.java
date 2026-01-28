package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFacilityCondition;
import com.monash.erp.wms.service.ProductFacilityConditionService;
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
@RequestMapping("/api/product-facility-conditions")
public class ProductFacilityConditionController {

    private final ProductFacilityConditionService service;

    public ProductFacilityConditionController(ProductFacilityConditionService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFacilityCondition> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFacilityCondition get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFacilityCondition> create(@RequestBody ProductFacilityCondition entity) {
        ProductFacilityCondition created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFacilityCondition update(@PathVariable Long id, @RequestBody ProductFacilityCondition entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}