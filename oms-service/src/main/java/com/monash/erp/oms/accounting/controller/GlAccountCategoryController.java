package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.GlAccountCategory;
import com.monash.erp.oms.accounting.service.GlAccountCategoryService;
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
@RequestMapping("/accounting/gl-account-categorys")
public class GlAccountCategoryController {

    private final GlAccountCategoryService service;

    public GlAccountCategoryController(GlAccountCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlAccountCategory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlAccountCategory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlAccountCategory> create(@RequestBody GlAccountCategory entity) {
        GlAccountCategory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlAccountCategory update(@PathVariable Long id, @RequestBody GlAccountCategory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
