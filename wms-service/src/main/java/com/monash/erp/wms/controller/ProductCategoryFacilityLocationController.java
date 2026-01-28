package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductCategoryFacilityLocation;
import com.monash.erp.wms.service.ProductCategoryFacilityLocationService;
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
@RequestMapping("/api/product-category-facility-locations")
public class ProductCategoryFacilityLocationController {

    private final ProductCategoryFacilityLocationService service;

    public ProductCategoryFacilityLocationController(ProductCategoryFacilityLocationService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductCategoryFacilityLocation> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductCategoryFacilityLocation get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductCategoryFacilityLocation> create(@RequestBody ProductCategoryFacilityLocation entity) {
        ProductCategoryFacilityLocation created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductCategoryFacilityLocation update(@PathVariable Long id, @RequestBody ProductCategoryFacilityLocation entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}