package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.ProductAverageCost;
import com.example.erp.oms.accounting.service.ProductAverageCostService;
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
@RequestMapping("/accounting/product-average-costs")
public class ProductAverageCostController {

    private final ProductAverageCostService service;

    public ProductAverageCostController(ProductAverageCostService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductAverageCost> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductAverageCost get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductAverageCost> create(@RequestBody ProductAverageCost entity) {
        ProductAverageCost created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductAverageCost update(@PathVariable Long id, @RequestBody ProductAverageCost entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
