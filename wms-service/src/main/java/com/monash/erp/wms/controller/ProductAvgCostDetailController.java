package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductAvgCostDetail;
import com.monash.erp.wms.service.ProductAvgCostDetailService;
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
@RequestMapping("/api/product-avg-cost-details")
public class ProductAvgCostDetailController {

    private final ProductAvgCostDetailService service;

    public ProductAvgCostDetailController(ProductAvgCostDetailService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductAvgCostDetail> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductAvgCostDetail get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductAvgCostDetail> create(@RequestBody ProductAvgCostDetail entity) {
        ProductAvgCostDetail created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductAvgCostDetail update(@PathVariable Long id, @RequestBody ProductAvgCostDetail entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}