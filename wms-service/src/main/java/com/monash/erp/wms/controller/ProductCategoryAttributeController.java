package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductCategoryAttribute;
import com.monash.erp.wms.service.ProductCategoryAttributeService;
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
@RequestMapping("/api/product-category-attributes")
public class ProductCategoryAttributeController {

    private final ProductCategoryAttributeService service;

    public ProductCategoryAttributeController(ProductCategoryAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductCategoryAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductCategoryAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductCategoryAttribute> create(@RequestBody ProductCategoryAttribute entity) {
        ProductCategoryAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductCategoryAttribute update(@PathVariable Long id, @RequestBody ProductCategoryAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}