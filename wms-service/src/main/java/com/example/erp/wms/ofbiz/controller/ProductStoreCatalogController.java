package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ProductStoreCatalog;
import com.example.erp.wms.ofbiz.service.ProductStoreCatalogService;
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
@RequestMapping("/ofbiz/product-store-catalogs")
public class ProductStoreCatalogController {

    private final ProductStoreCatalogService service;

    public ProductStoreCatalogController(ProductStoreCatalogService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStoreCatalog> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStoreCatalog get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStoreCatalog> create(@RequestBody ProductStoreCatalog entity) {
        ProductStoreCatalog created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStoreCatalog update(@PathVariable Long id, @RequestBody ProductStoreCatalog entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}