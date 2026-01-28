package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.BudgetAttribute;
import com.monash.erp.oms.service.BudgetAttributeService;
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
@RequestMapping("/api/budget-attributes")
public class BudgetAttributeController {

    private final BudgetAttributeService service;

    public BudgetAttributeController(BudgetAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<BudgetAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BudgetAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BudgetAttribute> create(@RequestBody BudgetAttribute entity) {
        BudgetAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BudgetAttribute update(@PathVariable Long id, @RequestBody BudgetAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}