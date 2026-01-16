package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ProductFeatureGroup;
import com.example.erp.wms.ofbiz.service.ProductFeatureGroupService;
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
@RequestMapping("/ofbiz/product-feature-groups")
public class ProductFeatureGroupController {

    private final ProductFeatureGroupService service;

    public ProductFeatureGroupController(ProductFeatureGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFeatureGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFeatureGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFeatureGroup> create(@RequestBody ProductFeatureGroup entity) {
        ProductFeatureGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureGroup update(@PathVariable Long id, @RequestBody ProductFeatureGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}