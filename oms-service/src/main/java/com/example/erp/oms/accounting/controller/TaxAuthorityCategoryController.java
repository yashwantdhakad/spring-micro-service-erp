package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.TaxAuthorityCategory;
import com.example.erp.oms.accounting.service.TaxAuthorityCategoryService;
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
@RequestMapping("/accounting/tax-authority-categorys")
public class TaxAuthorityCategoryController {

    private final TaxAuthorityCategoryService service;

    public TaxAuthorityCategoryController(TaxAuthorityCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaxAuthorityCategory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TaxAuthorityCategory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TaxAuthorityCategory> create(@RequestBody TaxAuthorityCategory entity) {
        TaxAuthorityCategory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TaxAuthorityCategory update(@PathVariable Long id, @RequestBody TaxAuthorityCategory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
