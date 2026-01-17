package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.EftAccount;
import com.example.erp.oms.accounting.service.EftAccountService;
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
@RequestMapping("/accounting/eft-accounts")
public class EftAccountController {

    private final EftAccountService service;

    public EftAccountController(EftAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<EftAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EftAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EftAccount> create(@RequestBody EftAccount entity) {
        EftAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EftAccount update(@PathVariable Long id, @RequestBody EftAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
