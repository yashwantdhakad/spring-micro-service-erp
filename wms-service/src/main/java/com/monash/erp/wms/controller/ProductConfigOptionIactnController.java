package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductConfigOptionIactn;
import com.monash.erp.wms.service.ProductConfigOptionIactnService;
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
@RequestMapping("/api/product-config-option-iactns")
public class ProductConfigOptionIactnController {

    private final ProductConfigOptionIactnService service;

    public ProductConfigOptionIactnController(ProductConfigOptionIactnService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductConfigOptionIactn> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductConfigOptionIactn get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductConfigOptionIactn> create(@RequestBody ProductConfigOptionIactn entity) {
        ProductConfigOptionIactn created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductConfigOptionIactn update(@PathVariable Long id, @RequestBody ProductConfigOptionIactn entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}