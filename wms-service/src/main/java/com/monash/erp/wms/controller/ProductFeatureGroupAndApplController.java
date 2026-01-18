package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFeatureGroupAndAppl;
import com.monash.erp.wms.service.ProductFeatureGroupAndApplService;
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
@RequestMapping("/ofbiz/product-feature-group-and-appls")
public class ProductFeatureGroupAndApplController {

    private final ProductFeatureGroupAndApplService service;

    public ProductFeatureGroupAndApplController(ProductFeatureGroupAndApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFeatureGroupAndAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFeatureGroupAndAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFeatureGroupAndAppl> create(@RequestBody ProductFeatureGroupAndAppl entity) {
        ProductFeatureGroupAndAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureGroupAndAppl update(@PathVariable Long id, @RequestBody ProductFeatureGroupAndAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}