package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductStorePromoAppl;
import com.monash.erp.wms.service.ProductStorePromoApplService;
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
@RequestMapping("/api/product-store-promo-appls")
public class ProductStorePromoApplController {

    private final ProductStorePromoApplService service;

    public ProductStorePromoApplController(ProductStorePromoApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStorePromoAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStorePromoAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStorePromoAppl> create(@RequestBody ProductStorePromoAppl entity) {
        ProductStorePromoAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStorePromoAppl update(@PathVariable Long id, @RequestBody ProductStorePromoAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}