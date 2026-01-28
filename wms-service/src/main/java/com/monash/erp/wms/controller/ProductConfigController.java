package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductConfig;
import com.monash.erp.wms.service.ProductConfigService;
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
@RequestMapping("/api/product-configs")
public class ProductConfigController {

    private final ProductConfigService service;

    public ProductConfigController(ProductConfigService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductConfig> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductConfig get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductConfig> create(@RequestBody ProductConfig entity) {
        ProductConfig created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductConfig update(@PathVariable Long id, @RequestBody ProductConfig entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}