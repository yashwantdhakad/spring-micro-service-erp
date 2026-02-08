package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.dto.SupplierProductDto;
import com.monash.erp.oms.party.service.SupplierProductService;
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
@RequestMapping("/api/supplier-products")
public class SupplierProductController {

    private final SupplierProductService service;

    public SupplierProductController(SupplierProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<SupplierProductDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SupplierProductDto get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SupplierProductDto> create(@RequestBody SupplierProductDto dto) {
        SupplierProductDto created = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SupplierProductDto update(@PathVariable Long id, @RequestBody SupplierProductDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}