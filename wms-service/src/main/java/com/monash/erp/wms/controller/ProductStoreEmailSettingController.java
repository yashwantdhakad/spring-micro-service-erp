package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductStoreEmailSetting;
import com.monash.erp.wms.service.ProductStoreEmailSettingService;
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
@RequestMapping("/ofbiz/product-store-email-settings")
public class ProductStoreEmailSettingController {

    private final ProductStoreEmailSettingService service;

    public ProductStoreEmailSettingController(ProductStoreEmailSettingService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductStoreEmailSetting> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductStoreEmailSetting get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductStoreEmailSetting> create(@RequestBody ProductStoreEmailSetting entity) {
        ProductStoreEmailSetting created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductStoreEmailSetting update(@PathVariable Long id, @RequestBody ProductStoreEmailSetting entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}