package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.BudgetScenarioApplication;
import com.monash.erp.oms.service.BudgetScenarioApplicationService;
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
@RequestMapping("/api/budget-scenario-applications")
public class BudgetScenarioApplicationController {

    private final BudgetScenarioApplicationService service;

    public BudgetScenarioApplicationController(BudgetScenarioApplicationService service) {
        this.service = service;
    }

    @GetMapping
    public List<BudgetScenarioApplication> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BudgetScenarioApplication get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BudgetScenarioApplication> create(@RequestBody BudgetScenarioApplication entity) {
        BudgetScenarioApplication created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BudgetScenarioApplication update(@PathVariable Long id, @RequestBody BudgetScenarioApplication entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}