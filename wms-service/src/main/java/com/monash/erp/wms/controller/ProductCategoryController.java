package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.ProductCategoryDetailResponse;
import com.monash.erp.wms.entity.ProductCategory;
import com.monash.erp.wms.service.ProductCategoryService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product-categories")
public class ProductCategoryController {

    private final ProductCategoryService service;

    public ProductCategoryController(ProductCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<java.util.List<ProductCategory>> list(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(required = false) String categoryName,
            @RequestParam(required = false) Integer size
    ) {
        int pageSize = size != null && size > 0 ? size : 10;
        Page<ProductCategory> result = service.list(page, pageSize, categoryName);
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(result.getTotalElements()))
                .body(result.getContent());
    }

    @GetMapping("/{id}")
    public ProductCategoryDetailResponse get(@PathVariable String id) {
        return service.getDetail(id);
    }

    @PostMapping
    public ResponseEntity<ProductCategory> create(@RequestBody ProductCategory entity) {
        ProductCategory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductCategory update(@PathVariable String id, @RequestBody ProductCategory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{productCategoryId}/products/{productId}")
    public ResponseEntity<Void> deleteCategoryMember(
            @PathVariable String productCategoryId,
            @PathVariable String productId
    ) {
        service.deleteMember(productCategoryId, productId);
        return ResponseEntity.noContent().build();
    }
}
