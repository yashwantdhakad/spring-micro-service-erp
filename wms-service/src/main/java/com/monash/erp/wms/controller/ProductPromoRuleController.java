package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPromoRule;
import com.monash.erp.wms.service.ProductPromoRuleService;
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
@RequestMapping("/api/product-promo-rules")
public class ProductPromoRuleController {

    private final ProductPromoRuleService service;

    public ProductPromoRuleController(ProductPromoRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPromoRule> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPromoRule get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPromoRule> create(@RequestBody ProductPromoRule entity) {
        ProductPromoRule created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPromoRule update(@PathVariable Long id, @RequestBody ProductPromoRule entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}