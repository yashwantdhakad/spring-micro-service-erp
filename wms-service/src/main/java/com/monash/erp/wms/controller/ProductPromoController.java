package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPromo;
import com.monash.erp.wms.service.ProductPromoService;
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
@RequestMapping("/api/product-promos")
public class ProductPromoController {

    private final ProductPromoService service;

    public ProductPromoController(ProductPromoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPromo> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPromo get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPromo> create(@RequestBody ProductPromo entity) {
        ProductPromo created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPromo update(@PathVariable Long id, @RequestBody ProductPromo entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}