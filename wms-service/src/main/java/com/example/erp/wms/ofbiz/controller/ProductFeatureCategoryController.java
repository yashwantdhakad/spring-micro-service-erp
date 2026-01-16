package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ProductFeatureCategory;
import com.example.erp.wms.ofbiz.service.ProductFeatureCategoryService;
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
@RequestMapping("/ofbiz/product-feature-categories")
public class ProductFeatureCategoryController {

    private final ProductFeatureCategoryService service;

    public ProductFeatureCategoryController(ProductFeatureCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFeatureCategory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFeatureCategory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFeatureCategory> create(@RequestBody ProductFeatureCategory entity) {
        ProductFeatureCategory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureCategory update(@PathVariable Long id, @RequestBody ProductFeatureCategory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}