package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductConfigStats;
import com.monash.erp.wms.service.ProductConfigStatsService;
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
@RequestMapping("/api/product-config-statses")
public class ProductConfigStatsController {

    private final ProductConfigStatsService service;

    public ProductConfigStatsController(ProductConfigStatsService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductConfigStats> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductConfigStats get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductConfigStats> create(@RequestBody ProductConfigStats entity) {
        ProductConfigStats created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductConfigStats update(@PathVariable Long id, @RequestBody ProductConfigStats entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}