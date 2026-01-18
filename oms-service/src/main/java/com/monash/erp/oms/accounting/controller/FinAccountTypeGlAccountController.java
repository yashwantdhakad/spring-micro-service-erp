package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FinAccountTypeGlAccount;
import com.monash.erp.oms.accounting.service.FinAccountTypeGlAccountService;
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
@RequestMapping("/accounting/fin-account-type-gl-accounts")
public class FinAccountTypeGlAccountController {

    private final FinAccountTypeGlAccountService service;

    public FinAccountTypeGlAccountController(FinAccountTypeGlAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinAccountTypeGlAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FinAccountTypeGlAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FinAccountTypeGlAccount> create(@RequestBody FinAccountTypeGlAccount entity) {
        FinAccountTypeGlAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FinAccountTypeGlAccount update(@PathVariable Long id, @RequestBody FinAccountTypeGlAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
