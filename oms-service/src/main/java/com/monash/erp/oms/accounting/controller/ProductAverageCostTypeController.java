package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.ProductAverageCostType;
import com.monash.erp.oms.accounting.service.ProductAverageCostTypeService;
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
@RequestMapping("/api/accounting/product-average-cost-types")
public class ProductAverageCostTypeController {

    private final ProductAverageCostTypeService service;

    public ProductAverageCostTypeController(ProductAverageCostTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductAverageCostType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductAverageCostType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductAverageCostType> create(@RequestBody ProductAverageCostType entity) {
        ProductAverageCostType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductAverageCostType update(@PathVariable Long id, @RequestBody ProductAverageCostType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
