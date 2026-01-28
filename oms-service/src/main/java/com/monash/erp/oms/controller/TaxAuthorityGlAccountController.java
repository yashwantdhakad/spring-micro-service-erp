package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.TaxAuthorityGlAccount;
import com.monash.erp.oms.service.TaxAuthorityGlAccountService;
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
@RequestMapping("/api/tax-authority-gl-accounts")
public class TaxAuthorityGlAccountController {

    private final TaxAuthorityGlAccountService service;

    public TaxAuthorityGlAccountController(TaxAuthorityGlAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaxAuthorityGlAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TaxAuthorityGlAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TaxAuthorityGlAccount> create(@RequestBody TaxAuthorityGlAccount entity) {
        TaxAuthorityGlAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TaxAuthorityGlAccount update(@PathVariable Long id, @RequestBody TaxAuthorityGlAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}