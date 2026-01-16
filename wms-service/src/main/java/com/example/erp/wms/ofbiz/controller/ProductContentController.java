package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ProductContent;
import com.example.erp.wms.ofbiz.service.ProductContentService;
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
@RequestMapping("/ofbiz/product-contents")
public class ProductContentController {

    private final ProductContentService service;

    public ProductContentController(ProductContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductContent> create(@RequestBody ProductContent entity) {
        ProductContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductContent update(@PathVariable Long id, @RequestBody ProductContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}