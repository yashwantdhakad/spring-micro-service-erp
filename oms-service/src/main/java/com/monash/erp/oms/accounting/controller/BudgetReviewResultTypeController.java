package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.BudgetReviewResultType;
import com.monash.erp.oms.accounting.service.BudgetReviewResultTypeService;
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
@RequestMapping("/accounting/budget-review-result-types")
public class BudgetReviewResultTypeController {

    private final BudgetReviewResultTypeService service;

    public BudgetReviewResultTypeController(BudgetReviewResultTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<BudgetReviewResultType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BudgetReviewResultType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BudgetReviewResultType> create(@RequestBody BudgetReviewResultType entity) {
        BudgetReviewResultType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BudgetReviewResultType update(@PathVariable Long id, @RequestBody BudgetReviewResultType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
