package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFacility;
import com.monash.erp.wms.service.ProductFacilityService;
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
@RequestMapping("/ofbiz/product-facilities")
public class ProductFacilityController {

    private final ProductFacilityService service;

    public ProductFacilityController(ProductFacilityService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFacility> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFacility get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFacility> create(@RequestBody ProductFacility entity) {
        ProductFacility created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFacility update(@PathVariable Long id, @RequestBody ProductFacility entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}