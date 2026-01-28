package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFeatureApplAttr;
import com.monash.erp.wms.service.ProductFeatureApplAttrService;
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
@RequestMapping("/api/product-feature-appl-attrs")
public class ProductFeatureApplAttrController {

    private final ProductFeatureApplAttrService service;

    public ProductFeatureApplAttrController(ProductFeatureApplAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFeatureApplAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFeatureApplAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFeatureApplAttr> create(@RequestBody ProductFeatureApplAttr entity) {
        ProductFeatureApplAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureApplAttr update(@PathVariable Long id, @RequestBody ProductFeatureApplAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}