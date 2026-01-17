package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.FinAccountTransAttribute;
import com.example.erp.oms.accounting.service.FinAccountTransAttributeService;
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
@RequestMapping("/accounting/fin-account-trans-attributes")
public class FinAccountTransAttributeController {

    private final FinAccountTransAttributeService service;

    public FinAccountTransAttributeController(FinAccountTransAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinAccountTransAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FinAccountTransAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FinAccountTransAttribute> create(@RequestBody FinAccountTransAttribute entity) {
        FinAccountTransAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FinAccountTransAttribute update(@PathVariable Long id, @RequestBody FinAccountTransAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
