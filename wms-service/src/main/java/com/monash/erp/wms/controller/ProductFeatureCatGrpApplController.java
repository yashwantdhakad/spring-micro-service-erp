package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductFeatureCatGrpAppl;
import com.monash.erp.wms.service.ProductFeatureCatGrpApplService;
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
@RequestMapping("/ofbiz/product-feature-cat-grp-appls")
public class ProductFeatureCatGrpApplController {

    private final ProductFeatureCatGrpApplService service;

    public ProductFeatureCatGrpApplController(ProductFeatureCatGrpApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductFeatureCatGrpAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductFeatureCatGrpAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductFeatureCatGrpAppl> create(@RequestBody ProductFeatureCatGrpAppl entity) {
        ProductFeatureCatGrpAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureCatGrpAppl update(@PathVariable Long id, @RequestBody ProductFeatureCatGrpAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}