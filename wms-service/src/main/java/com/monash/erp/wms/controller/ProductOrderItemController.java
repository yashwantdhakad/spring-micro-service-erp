package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductOrderItem;
import com.monash.erp.wms.service.ProductOrderItemService;
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
@RequestMapping("/api/product-order-items")
public class ProductOrderItemController {

    private final ProductOrderItemService service;

    public ProductOrderItemController(ProductOrderItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductOrderItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductOrderItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductOrderItem> create(@RequestBody ProductOrderItem entity) {
        ProductOrderItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductOrderItem update(@PathVariable Long id, @RequestBody ProductOrderItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}