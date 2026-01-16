package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ProductPriceType;
import com.example.erp.wms.ofbiz.service.ProductPriceTypeService;
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
@RequestMapping("/ofbiz/product-price-types")
public class ProductPriceTypeController {

    private final ProductPriceTypeService service;

    public ProductPriceTypeController(ProductPriceTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPriceType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPriceType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPriceType> create(@RequestBody ProductPriceType entity) {
        ProductPriceType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPriceType update(@PathVariable Long id, @RequestBody ProductPriceType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}