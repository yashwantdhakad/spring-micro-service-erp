package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.FinAccount;
import com.example.erp.oms.accounting.service.FinAccountService;
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
@RequestMapping("/accounting/fin-accounts")
public class FinAccountController {

    private final FinAccountService service;

    public FinAccountController(FinAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FinAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FinAccount> create(@RequestBody FinAccount entity) {
        FinAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FinAccount update(@PathVariable Long id, @RequestBody FinAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
