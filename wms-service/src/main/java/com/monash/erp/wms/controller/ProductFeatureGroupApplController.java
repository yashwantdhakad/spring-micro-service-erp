package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFeatureGroupAppl;
import com.monash.erp.wms.service.ProductFeatureGroupApplService;
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
@RequestMapping("/api/product-feature-group-appls")
public class ProductFeatureGroupApplController {

    private final ProductFeatureGroupApplService service;

    public ProductFeatureGroupApplController(ProductFeatureGroupApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFeatureGroupAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFeatureGroupAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFeatureGroupAppl> create(@RequestBody ProductFeatureGroupAppl entity) {
        ProductFeatureGroupAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureGroupAppl update(@PathVariable Long id, @RequestBody ProductFeatureGroupAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}