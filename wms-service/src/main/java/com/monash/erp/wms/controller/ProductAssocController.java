package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductAssoc;
import com.monash.erp.wms.service.ProductAssocService;
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
@RequestMapping("/ofbiz/product-assocs")
public class ProductAssocController {

    private final ProductAssocService service;

    public ProductAssocController(ProductAssocService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductAssoc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductAssoc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductAssoc> create(@RequestBody ProductAssoc entity) {
        ProductAssoc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductAssoc update(@PathVariable Long id, @RequestBody ProductAssoc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}