package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CreditCardTypeGlAccount;
import com.monash.erp.wms.service.CreditCardTypeGlAccountService;
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
@RequestMapping("/api/credit-card-type-gl-accounts")
public class CreditCardTypeGlAccountController {

    private final CreditCardTypeGlAccountService service;

    public CreditCardTypeGlAccountController(CreditCardTypeGlAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<CreditCardTypeGlAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CreditCardTypeGlAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CreditCardTypeGlAccount> create(@RequestBody CreditCardTypeGlAccount entity) {
        CreditCardTypeGlAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CreditCardTypeGlAccount update(@PathVariable Long id, @RequestBody CreditCardTypeGlAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}