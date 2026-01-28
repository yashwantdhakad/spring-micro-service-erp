package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.TaxAuthorityRateProduct;
import com.monash.erp.oms.service.TaxAuthorityRateProductService;
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
@RequestMapping("/api/tax-authority-rate-products")
public class TaxAuthorityRateProductController {

    private final TaxAuthorityRateProductService service;

    public TaxAuthorityRateProductController(TaxAuthorityRateProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaxAuthorityRateProduct> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TaxAuthorityRateProduct get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TaxAuthorityRateProduct> create(@RequestBody TaxAuthorityRateProduct entity) {
        TaxAuthorityRateProduct created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TaxAuthorityRateProduct update(@PathVariable Long id, @RequestBody TaxAuthorityRateProduct entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}