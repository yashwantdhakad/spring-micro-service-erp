package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProdCatalogCategory;
import com.monash.erp.wms.service.ProdCatalogCategoryService;
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
@RequestMapping("/ofbiz/prod-catalog-categories")
public class ProdCatalogCategoryController {

    private final ProdCatalogCategoryService service;

    public ProdCatalogCategoryController(ProdCatalogCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProdCatalogCategory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProdCatalogCategory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProdCatalogCategory> create(@RequestBody ProdCatalogCategory entity) {
        ProdCatalogCategory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProdCatalogCategory update(@PathVariable Long id, @RequestBody ProdCatalogCategory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}