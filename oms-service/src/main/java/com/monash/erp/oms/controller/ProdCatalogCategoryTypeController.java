package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.ProdCatalogCategoryType;
import com.monash.erp.oms.service.ProdCatalogCategoryTypeService;
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
@RequestMapping("/api/prod-catalog-category-types")
public class ProdCatalogCategoryTypeController {

    private final ProdCatalogCategoryTypeService service;

    public ProdCatalogCategoryTypeController(ProdCatalogCategoryTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProdCatalogCategoryType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProdCatalogCategoryType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProdCatalogCategoryType> create(@RequestBody ProdCatalogCategoryType entity) {
        ProdCatalogCategoryType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProdCatalogCategoryType update(@PathVariable Long id, @RequestBody ProdCatalogCategoryType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}