package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPricePurpose;
import com.monash.erp.wms.service.ProductPricePurposeService;
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
@RequestMapping("/api/product-price-purposes")
public class ProductPricePurposeController {

    private final ProductPricePurposeService service;

    public ProductPricePurposeController(ProductPricePurposeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPricePurpose> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPricePurpose get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPricePurpose> create(@RequestBody ProductPricePurpose entity) {
        ProductPricePurpose created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPricePurpose update(@PathVariable Long id, @RequestBody ProductPricePurpose entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}