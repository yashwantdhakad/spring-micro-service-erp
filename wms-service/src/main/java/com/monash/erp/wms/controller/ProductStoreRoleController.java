package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductStoreRole;
import com.monash.erp.wms.service.ProductStoreRoleService;
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
@RequestMapping("/api/product-store-roles")
public class ProductStoreRoleController {

    private final ProductStoreRoleService service;

    public ProductStoreRoleController(ProductStoreRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStoreRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStoreRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStoreRole> create(@RequestBody ProductStoreRole entity) {
        ProductStoreRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStoreRole update(@PathVariable Long id, @RequestBody ProductStoreRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}