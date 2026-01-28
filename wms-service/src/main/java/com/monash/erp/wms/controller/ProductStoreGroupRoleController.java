package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductStoreGroupRole;
import com.monash.erp.wms.service.ProductStoreGroupRoleService;
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
@RequestMapping("/api/product-store-group-roles")
public class ProductStoreGroupRoleController {

    private final ProductStoreGroupRoleService service;

    public ProductStoreGroupRoleController(ProductStoreGroupRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStoreGroupRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStoreGroupRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStoreGroupRole> create(@RequestBody ProductStoreGroupRole entity) {
        ProductStoreGroupRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStoreGroupRole update(@PathVariable Long id, @RequestBody ProductStoreGroupRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}