package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.BudgetItem;
import com.monash.erp.oms.accounting.service.BudgetItemService;
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
@RequestMapping("/api/accounting/budget-items")
public class BudgetItemController {

    private final BudgetItemService service;

    public BudgetItemController(BudgetItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<BudgetItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BudgetItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BudgetItem> create(@RequestBody BudgetItem entity) {
        BudgetItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BudgetItem update(@PathVariable Long id, @RequestBody BudgetItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
