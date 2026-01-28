package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFeatureDataResource;
import com.monash.erp.wms.service.ProductFeatureDataResourceService;
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
@RequestMapping("/api/product-feature-data-resources")
public class ProductFeatureDataResourceController {

    private final ProductFeatureDataResourceService service;

    public ProductFeatureDataResourceController(ProductFeatureDataResourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFeatureDataResource> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFeatureDataResource get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFeatureDataResource> create(@RequestBody ProductFeatureDataResource entity) {
        ProductFeatureDataResource created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureDataResource update(@PathVariable Long id, @RequestBody ProductFeatureDataResource entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}