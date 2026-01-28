package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductStoreVendorPayment;
import com.monash.erp.wms.service.ProductStoreVendorPaymentService;
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
@RequestMapping("/api/product-store-vendor-payments")
public class ProductStoreVendorPaymentController {

    private final ProductStoreVendorPaymentService service;

    public ProductStoreVendorPaymentController(ProductStoreVendorPaymentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStoreVendorPayment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStoreVendorPayment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStoreVendorPayment> create(@RequestBody ProductStoreVendorPayment entity) {
        ProductStoreVendorPayment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStoreVendorPayment update(@PathVariable Long id, @RequestBody ProductStoreVendorPayment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}