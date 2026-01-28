package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.RequirementBudgetAllocation;
import com.monash.erp.wms.service.RequirementBudgetAllocationService;
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
@RequestMapping("/api/requirement-budget-allocations")
public class RequirementBudgetAllocationController {

    private final RequirementBudgetAllocationService service;

    public RequirementBudgetAllocationController(RequirementBudgetAllocationService service) {
        this.service = service;
    }

    @GetMapping
    public List<RequirementBudgetAllocation> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RequirementBudgetAllocation get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RequirementBudgetAllocation> create(@RequestBody RequirementBudgetAllocation entity) {
        RequirementBudgetAllocation created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RequirementBudgetAllocation update(@PathVariable Long id, @RequestBody RequirementBudgetAllocation entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}