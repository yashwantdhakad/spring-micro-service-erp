package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequestCategory;
import com.monash.erp.oms.service.CustRequestCategoryService;
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
@RequestMapping("/api/cust-request-categories")
public class CustRequestCategoryController {

    private final CustRequestCategoryService service;

    public CustRequestCategoryController(CustRequestCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequestCategory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequestCategory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequestCategory> create(@RequestBody CustRequestCategory entity) {
        CustRequestCategory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequestCategory update(@PathVariable Long id, @RequestBody CustRequestCategory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}