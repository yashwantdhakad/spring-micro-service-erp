package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductConfigConfig;
import com.monash.erp.wms.service.ProductConfigConfigService;
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
@RequestMapping("/api/product-config-configs")
public class ProductConfigConfigController {

    private final ProductConfigConfigService service;

    public ProductConfigConfigController(ProductConfigConfigService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductConfigConfig> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductConfigConfig get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductConfigConfig> create(@RequestBody ProductConfigConfig entity) {
        ProductConfigConfig created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductConfigConfig update(@PathVariable Long id, @RequestBody ProductConfigConfig entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}