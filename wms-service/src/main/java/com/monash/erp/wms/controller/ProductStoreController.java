package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductStore;
import com.monash.erp.wms.service.ProductStoreService;
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
@RequestMapping("/api/product-stores")
public class ProductStoreController {

    private final ProductStoreService service;

    public ProductStoreController(ProductStoreService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStore> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStore get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStore> create(@RequestBody ProductStore entity) {
        ProductStore created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStore update(@PathVariable Long id, @RequestBody ProductStore entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}