package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ProductCostComponentCalc;
import com.example.erp.wms.ofbiz.service.ProductCostComponentCalcService;
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
@RequestMapping("/ofbiz/product-cost-component-calcs")
public class ProductCostComponentCalcController {

    private final ProductCostComponentCalcService service;

    public ProductCostComponentCalcController(ProductCostComponentCalcService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductCostComponentCalc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductCostComponentCalc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductCostComponentCalc> create(@RequestBody ProductCostComponentCalc entity) {
        ProductCostComponentCalc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductCostComponentCalc update(@PathVariable Long id, @RequestBody ProductCostComponentCalc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}