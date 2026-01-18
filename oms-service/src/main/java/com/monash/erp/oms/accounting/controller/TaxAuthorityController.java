package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.TaxAuthority;
import com.monash.erp.oms.accounting.service.TaxAuthorityService;
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
@RequestMapping("/api/accounting/tax-authoritys")
public class TaxAuthorityController {

    private final TaxAuthorityService service;

    public TaxAuthorityController(TaxAuthorityService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaxAuthority> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TaxAuthority get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TaxAuthority> create(@RequestBody TaxAuthority entity) {
        TaxAuthority created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TaxAuthority update(@PathVariable Long id, @RequestBody TaxAuthority entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
