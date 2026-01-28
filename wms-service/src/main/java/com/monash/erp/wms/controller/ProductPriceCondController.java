package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPriceCond;
import com.monash.erp.wms.service.ProductPriceCondService;
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
@RequestMapping("/api/product-price-conds")
public class ProductPriceCondController {

    private final ProductPriceCondService service;

    public ProductPriceCondController(ProductPriceCondService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPriceCond> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPriceCond get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPriceCond> create(@RequestBody ProductPriceCond entity) {
        ProductPriceCond created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPriceCond update(@PathVariable Long id, @RequestBody ProductPriceCond entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}