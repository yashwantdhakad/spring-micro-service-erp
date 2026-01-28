package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductCategoryRole;
import com.monash.erp.wms.service.ProductCategoryRoleService;
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
@RequestMapping("/api/product-category-roles")
public class ProductCategoryRoleController {

    private final ProductCategoryRoleService service;

    public ProductCategoryRoleController(ProductCategoryRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductCategoryRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductCategoryRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductCategoryRole> create(@RequestBody ProductCategoryRole entity) {
        ProductCategoryRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductCategoryRole update(@PathVariable Long id, @RequestBody ProductCategoryRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}