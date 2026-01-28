package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductSearchResult;
import com.monash.erp.wms.service.ProductSearchResultService;
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
@RequestMapping("/api/product-search-results")
public class ProductSearchResultController {

    private final ProductSearchResultService service;

    public ProductSearchResultController(ProductSearchResultService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductSearchResult> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductSearchResult get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductSearchResult> create(@RequestBody ProductSearchResult entity) {
        ProductSearchResult created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductSearchResult update(@PathVariable Long id, @RequestBody ProductSearchResult entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}