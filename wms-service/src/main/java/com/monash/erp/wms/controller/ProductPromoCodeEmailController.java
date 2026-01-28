package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPromoCodeEmail;
import com.monash.erp.wms.service.ProductPromoCodeEmailService;
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
@RequestMapping("/api/product-promo-code-emails")
public class ProductPromoCodeEmailController {

    private final ProductPromoCodeEmailService service;

    public ProductPromoCodeEmailController(ProductPromoCodeEmailService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPromoCodeEmail> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPromoCodeEmail get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPromoCodeEmail> create(@RequestBody ProductPromoCodeEmail entity) {
        ProductPromoCodeEmail created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPromoCodeEmail update(@PathVariable Long id, @RequestBody ProductPromoCodeEmail entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}