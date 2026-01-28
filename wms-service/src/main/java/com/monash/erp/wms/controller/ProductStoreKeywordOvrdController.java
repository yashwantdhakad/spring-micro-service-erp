package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductStoreKeywordOvrd;
import com.monash.erp.wms.service.ProductStoreKeywordOvrdService;
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
@RequestMapping("/api/product-store-keyword-ovrds")
public class ProductStoreKeywordOvrdController {

    private final ProductStoreKeywordOvrdService service;

    public ProductStoreKeywordOvrdController(ProductStoreKeywordOvrdService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStoreKeywordOvrd> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStoreKeywordOvrd get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStoreKeywordOvrd> create(@RequestBody ProductStoreKeywordOvrd entity) {
        ProductStoreKeywordOvrd created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStoreKeywordOvrd update(@PathVariable Long id, @RequestBody ProductStoreKeywordOvrd entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}