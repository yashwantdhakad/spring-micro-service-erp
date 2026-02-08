package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFacilityLocation;
import com.monash.erp.wms.service.ProductFacilityLocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product-facility-locations")
public class ProductFacilityLocationController {

    private final ProductFacilityLocationService service;

    public ProductFacilityLocationController(ProductFacilityLocationService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFacilityLocation> list(@RequestParam(required = false) String productId,
            @RequestParam(required = false) String facilityId) {
        if (productId != null) {
            return service.findByProductId(productId);
        }
        if (facilityId != null) {
            return service.findByFacilityId(facilityId);
        }
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFacilityLocation get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFacilityLocation> create(@RequestBody ProductFacilityLocation entity) {
        ProductFacilityLocation created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFacilityLocation update(@PathVariable Long id, @RequestBody ProductFacilityLocation entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}