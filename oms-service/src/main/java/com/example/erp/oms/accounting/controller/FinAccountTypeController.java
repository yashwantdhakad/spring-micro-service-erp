package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.FinAccountType;
import com.example.erp.oms.accounting.service.FinAccountTypeService;
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
@RequestMapping("/accounting/fin-account-types")
public class FinAccountTypeController {

    private final FinAccountTypeService service;

    public FinAccountTypeController(FinAccountTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinAccountType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FinAccountType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FinAccountType> create(@RequestBody FinAccountType entity) {
        FinAccountType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FinAccountType update(@PathVariable Long id, @RequestBody FinAccountType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
