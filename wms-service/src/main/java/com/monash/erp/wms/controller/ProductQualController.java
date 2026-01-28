package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductQual;
import com.monash.erp.wms.service.ProductQualService;
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
@RequestMapping("/api/product-quals")
public class ProductQualController {

    private final ProductQualService service;

    public ProductQualController(ProductQualService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductQual> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductQual get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductQual> create(@RequestBody ProductQual entity) {
        ProductQual created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductQual update(@PathVariable Long id, @RequestBody ProductQual entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}