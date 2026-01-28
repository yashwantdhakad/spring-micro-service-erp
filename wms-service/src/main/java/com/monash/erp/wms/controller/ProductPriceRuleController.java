package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPriceRule;
import com.monash.erp.wms.service.ProductPriceRuleService;
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
@RequestMapping("/api/product-price-rules")
public class ProductPriceRuleController {

    private final ProductPriceRuleService service;

    public ProductPriceRuleController(ProductPriceRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPriceRule> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPriceRule get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPriceRule> create(@RequestBody ProductPriceRule entity) {
        ProductPriceRule created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPriceRule update(@PathVariable Long id, @RequestBody ProductPriceRule entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}