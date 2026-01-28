package com.monash.erp.party.controller;

import com.monash.erp.party.entity.SupplierQual;
import com.monash.erp.party.service.SupplierQualService;
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
@RequestMapping("/api/supplier-quals")
public class SupplierQualController {

    private final SupplierQualService service;

    public SupplierQualController(SupplierQualService service) {
        this.service = service;
    }

    @GetMapping
    public List<SupplierQual> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SupplierQual get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SupplierQual> create(@RequestBody SupplierQual entity) {
        SupplierQual created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SupplierQual update(@PathVariable Long id, @RequestBody SupplierQual entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}