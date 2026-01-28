package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductIdentificationType;
import com.monash.erp.wms.service.ProductIdentificationTypeService;
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
@RequestMapping("/api/product-identification-types")
public class ProductIdentificationTypeController {

    private final ProductIdentificationTypeService service;

    public ProductIdentificationTypeController(ProductIdentificationTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductIdentificationType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductIdentificationType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductIdentificationType> create(@RequestBody ProductIdentificationType entity) {
        ProductIdentificationType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductIdentificationType update(@PathVariable Long id, @RequestBody ProductIdentificationType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}