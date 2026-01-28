package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductStoreGroup;
import com.monash.erp.wms.service.ProductStoreGroupService;
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
@RequestMapping("/api/product-store-groups")
public class ProductStoreGroupController {

    private final ProductStoreGroupService service;

    public ProductStoreGroupController(ProductStoreGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStoreGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStoreGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStoreGroup> create(@RequestBody ProductStoreGroup entity) {
        ProductStoreGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStoreGroup update(@PathVariable Long id, @RequestBody ProductStoreGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}