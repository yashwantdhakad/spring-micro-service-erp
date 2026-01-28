package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPriceChange;
import com.monash.erp.wms.service.ProductPriceChangeService;
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
@RequestMapping("/api/product-price-changes")
public class ProductPriceChangeController {

    private final ProductPriceChangeService service;

    public ProductPriceChangeController(ProductPriceChangeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPriceChange> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPriceChange get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPriceChange> create(@RequestBody ProductPriceChange entity) {
        ProductPriceChange created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPriceChange update(@PathVariable Long id, @RequestBody ProductPriceChange entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}