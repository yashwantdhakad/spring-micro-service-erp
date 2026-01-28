package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPromoCode;
import com.monash.erp.wms.service.ProductPromoCodeService;
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
@RequestMapping("/api/product-promo-codes")
public class ProductPromoCodeController {

    private final ProductPromoCodeService service;

    public ProductPromoCodeController(ProductPromoCodeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPromoCode> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPromoCode get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPromoCode> create(@RequestBody ProductPromoCode entity) {
        ProductPromoCode created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPromoCode update(@PathVariable Long id, @RequestBody ProductPromoCode entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}