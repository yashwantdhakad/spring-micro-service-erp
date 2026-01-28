package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFeatureIactnType;
import com.monash.erp.wms.service.ProductFeatureIactnTypeService;
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
@RequestMapping("/api/product-feature-iactn-types")
public class ProductFeatureIactnTypeController {

    private final ProductFeatureIactnTypeService service;

    public ProductFeatureIactnTypeController(ProductFeatureIactnTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFeatureIactnType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFeatureIactnType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFeatureIactnType> create(@RequestBody ProductFeatureIactnType entity) {
        ProductFeatureIactnType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureIactnType update(@PathVariable Long id, @RequestBody ProductFeatureIactnType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}