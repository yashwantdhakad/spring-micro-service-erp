package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.FinAccountTypeAttr;
import com.example.erp.oms.accounting.service.FinAccountTypeAttrService;
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
@RequestMapping("/accounting/fin-account-type-attrs")
public class FinAccountTypeAttrController {

    private final FinAccountTypeAttrService service;

    public FinAccountTypeAttrController(FinAccountTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinAccountTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FinAccountTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FinAccountTypeAttr> create(@RequestBody FinAccountTypeAttr entity) {
        FinAccountTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FinAccountTypeAttr update(@PathVariable Long id, @RequestBody FinAccountTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
