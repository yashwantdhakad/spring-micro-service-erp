package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductSubscriptionResource;
import com.monash.erp.wms.service.ProductSubscriptionResourceService;
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
@RequestMapping("/api/product-subscription-resources")
public class ProductSubscriptionResourceController {

    private final ProductSubscriptionResourceService service;

    public ProductSubscriptionResourceController(ProductSubscriptionResourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductSubscriptionResource> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductSubscriptionResource get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductSubscriptionResource> create(@RequestBody ProductSubscriptionResource entity) {
        ProductSubscriptionResource created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductSubscriptionResource update(@PathVariable Long id, @RequestBody ProductSubscriptionResource entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}