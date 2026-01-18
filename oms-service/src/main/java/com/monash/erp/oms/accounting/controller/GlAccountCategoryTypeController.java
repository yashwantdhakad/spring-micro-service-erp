package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.GlAccountCategoryType;
import com.monash.erp.oms.accounting.service.GlAccountCategoryTypeService;
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
@RequestMapping("/accounting/gl-account-category-types")
public class GlAccountCategoryTypeController {

    private final GlAccountCategoryTypeService service;

    public GlAccountCategoryTypeController(GlAccountCategoryTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlAccountCategoryType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlAccountCategoryType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlAccountCategoryType> create(@RequestBody GlAccountCategoryType entity) {
        GlAccountCategoryType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlAccountCategoryType update(@PathVariable Long id, @RequestBody GlAccountCategoryType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
