package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.GlAccount;
import com.monash.erp.oms.accounting.service.GlAccountService;
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
@RequestMapping("/api/accounting/gl-accounts")
public class GlAccountController {

    private final GlAccountService service;

    public GlAccountController(GlAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlAccount> create(@RequestBody GlAccount entity) {
        GlAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlAccount update(@PathVariable Long id, @RequestBody GlAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
