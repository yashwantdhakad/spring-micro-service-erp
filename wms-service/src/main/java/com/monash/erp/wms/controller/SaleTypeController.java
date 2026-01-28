package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SaleType;
import com.monash.erp.wms.service.SaleTypeService;
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
@RequestMapping("/api/sale-types")
public class SaleTypeController {

    private final SaleTypeService service;

    public SaleTypeController(SaleTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<SaleType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SaleType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SaleType> create(@RequestBody SaleType entity) {
        SaleType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SaleType update(@PathVariable Long id, @RequestBody SaleType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}