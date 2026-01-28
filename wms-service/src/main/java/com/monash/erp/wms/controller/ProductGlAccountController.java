package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductGlAccount;
import com.monash.erp.wms.service.ProductGlAccountService;
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
@RequestMapping("/api/product-gl-accounts")
public class ProductGlAccountController {

    private final ProductGlAccountService service;

    public ProductGlAccountController(ProductGlAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductGlAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductGlAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductGlAccount> create(@RequestBody ProductGlAccount entity) {
        ProductGlAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductGlAccount update(@PathVariable Long id, @RequestBody ProductGlAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}