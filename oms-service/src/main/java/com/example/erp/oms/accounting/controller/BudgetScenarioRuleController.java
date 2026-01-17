package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.BudgetScenarioRule;
import com.example.erp.oms.accounting.service.BudgetScenarioRuleService;
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
@RequestMapping("/accounting/budget-scenario-rules")
public class BudgetScenarioRuleController {

    private final BudgetScenarioRuleService service;

    public BudgetScenarioRuleController(BudgetScenarioRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<BudgetScenarioRule> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BudgetScenarioRule get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BudgetScenarioRule> create(@RequestBody BudgetScenarioRule entity) {
        BudgetScenarioRule created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BudgetScenarioRule update(@PathVariable Long id, @RequestBody BudgetScenarioRule entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
