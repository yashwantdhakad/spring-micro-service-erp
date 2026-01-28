package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPromoProduct;
import com.monash.erp.wms.service.ProductPromoProductService;
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
@RequestMapping("/api/product-promo-products")
public class ProductPromoProductController {

    private final ProductPromoProductService service;

    public ProductPromoProductController(ProductPromoProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPromoProduct> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPromoProduct get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPromoProduct> create(@RequestBody ProductPromoProduct entity) {
        ProductPromoProduct created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPromoProduct update(@PathVariable Long id, @RequestBody ProductPromoProduct entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}