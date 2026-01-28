package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductMeter;
import com.monash.erp.wms.service.ProductMeterService;
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
@RequestMapping("/api/product-meters")
public class ProductMeterController {

    private final ProductMeterService service;

    public ProductMeterController(ProductMeterService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductMeter> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductMeter get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductMeter> create(@RequestBody ProductMeter entity) {
        ProductMeter created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductMeter update(@PathVariable Long id, @RequestBody ProductMeter entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}