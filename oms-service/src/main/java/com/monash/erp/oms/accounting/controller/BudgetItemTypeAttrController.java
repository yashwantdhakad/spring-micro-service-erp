package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.BudgetItemTypeAttr;
import com.monash.erp.oms.accounting.service.BudgetItemTypeAttrService;
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
@RequestMapping("/api/accounting/budget-item-type-attrs")
public class BudgetItemTypeAttrController {

    private final BudgetItemTypeAttrService service;

    public BudgetItemTypeAttrController(BudgetItemTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<BudgetItemTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BudgetItemTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BudgetItemTypeAttr> create(@RequestBody BudgetItemTypeAttr entity) {
        BudgetItemTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BudgetItemTypeAttr update(@PathVariable Long id, @RequestBody BudgetItemTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
