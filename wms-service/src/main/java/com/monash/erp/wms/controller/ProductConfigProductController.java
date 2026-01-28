package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductConfigProduct;
import com.monash.erp.wms.service.ProductConfigProductService;
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
@RequestMapping("/api/product-config-products")
public class ProductConfigProductController {

    private final ProductConfigProductService service;

    public ProductConfigProductController(ProductConfigProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductConfigProduct> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductConfigProduct get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductConfigProduct> create(@RequestBody ProductConfigProduct entity) {
        ProductConfigProduct created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductConfigProduct update(@PathVariable Long id, @RequestBody ProductConfigProduct entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}