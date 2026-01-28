package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPaymentMethodType;
import com.monash.erp.wms.service.ProductPaymentMethodTypeService;
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
@RequestMapping("/api/product-payment-method-types")
public class ProductPaymentMethodTypeController {

    private final ProductPaymentMethodTypeService service;

    public ProductPaymentMethodTypeController(ProductPaymentMethodTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPaymentMethodType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPaymentMethodType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPaymentMethodType> create(@RequestBody ProductPaymentMethodType entity) {
        ProductPaymentMethodType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPaymentMethodType update(@PathVariable Long id, @RequestBody ProductPaymentMethodType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}