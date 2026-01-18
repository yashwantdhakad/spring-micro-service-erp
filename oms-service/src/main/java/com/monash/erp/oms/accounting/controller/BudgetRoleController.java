package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.BudgetRole;
import com.monash.erp.oms.accounting.service.BudgetRoleService;
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
@RequestMapping("/api/accounting/budget-roles")
public class BudgetRoleController {

    private final BudgetRoleService service;

    public BudgetRoleController(BudgetRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<BudgetRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BudgetRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BudgetRole> create(@RequestBody BudgetRole entity) {
        BudgetRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BudgetRole update(@PathVariable Long id, @RequestBody BudgetRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
