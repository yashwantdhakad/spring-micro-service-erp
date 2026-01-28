package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductRole;
import com.monash.erp.wms.service.ProductRoleService;
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
@RequestMapping("/api/product-roles")
public class ProductRoleController {

    private final ProductRoleService service;

    public ProductRoleController(ProductRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductRole> create(@RequestBody ProductRole entity) {
        ProductRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductRole update(@PathVariable Long id, @RequestBody ProductRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}