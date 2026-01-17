package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.BudgetRevision;
import com.example.erp.oms.accounting.service.BudgetRevisionService;
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
@RequestMapping("/accounting/budget-revisions")
public class BudgetRevisionController {

    private final BudgetRevisionService service;

    public BudgetRevisionController(BudgetRevisionService service) {
        this.service = service;
    }

    @GetMapping
    public List<BudgetRevision> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BudgetRevision get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BudgetRevision> create(@RequestBody BudgetRevision entity) {
        BudgetRevision created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BudgetRevision update(@PathVariable Long id, @RequestBody BudgetRevision entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
