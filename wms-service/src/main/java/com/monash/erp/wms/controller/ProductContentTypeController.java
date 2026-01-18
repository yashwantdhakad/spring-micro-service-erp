package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductContentType;
import com.monash.erp.wms.service.ProductContentTypeService;
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
@RequestMapping("/ofbiz/product-content-types")
public class ProductContentTypeController {

    private final ProductContentTypeService service;

    public ProductContentTypeController(ProductContentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductContentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductContentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductContentType> create(@RequestBody ProductContentType entity) {
        ProductContentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductContentType update(@PathVariable Long id, @RequestBody ProductContentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}