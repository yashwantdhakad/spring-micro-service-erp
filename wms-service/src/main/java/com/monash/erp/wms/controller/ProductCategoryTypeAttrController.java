package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductCategoryTypeAttr;
import com.monash.erp.wms.service.ProductCategoryTypeAttrService;
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
@RequestMapping("/api/product-category-type-attrs")
public class ProductCategoryTypeAttrController {

    private final ProductCategoryTypeAttrService service;

    public ProductCategoryTypeAttrController(ProductCategoryTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductCategoryTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductCategoryTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductCategoryTypeAttr> create(@RequestBody ProductCategoryTypeAttr entity) {
        ProductCategoryTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductCategoryTypeAttr update(@PathVariable Long id, @RequestBody ProductCategoryTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}