package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FinAccountAuth;
import com.monash.erp.oms.accounting.service.FinAccountAuthService;
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
@RequestMapping("/api/accounting/fin-account-auths")
public class FinAccountAuthController {

    private final FinAccountAuthService service;

    public FinAccountAuthController(FinAccountAuthService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinAccountAuth> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FinAccountAuth get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FinAccountAuth> create(@RequestBody FinAccountAuth entity) {
        FinAccountAuth created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FinAccountAuth update(@PathVariable Long id, @RequestBody FinAccountAuth entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
