package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.TaxAuthorityRateType;
import com.monash.erp.oms.service.TaxAuthorityRateTypeService;
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
@RequestMapping("/api/tax-authority-rate-types")
public class TaxAuthorityRateTypeController {

    private final TaxAuthorityRateTypeService service;

    public TaxAuthorityRateTypeController(TaxAuthorityRateTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaxAuthorityRateType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TaxAuthorityRateType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TaxAuthorityRateType> create(@RequestBody TaxAuthorityRateType entity) {
        TaxAuthorityRateType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TaxAuthorityRateType update(@PathVariable Long id, @RequestBody TaxAuthorityRateType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}