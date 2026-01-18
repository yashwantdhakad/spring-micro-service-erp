package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductKeyword;
import com.monash.erp.wms.service.ProductKeywordService;
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
@RequestMapping("/ofbiz/product-keywords")
public class ProductKeywordController {

    private final ProductKeywordService service;

    public ProductKeywordController(ProductKeywordService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductKeyword> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductKeyword get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductKeyword> create(@RequestBody ProductKeyword entity) {
        ProductKeyword created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductKeyword update(@PathVariable Long id, @RequestBody ProductKeyword entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}