package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortCostCalc;
import com.monash.erp.mfg.service.WorkEffortCostCalcService;
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
@RequestMapping("/ofbiz/work-effort-cost-calcs")
public class WorkEffortCostCalcController {

    private final WorkEffortCostCalcService service;

    public WorkEffortCostCalcController(WorkEffortCostCalcService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortCostCalc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortCostCalc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortCostCalc> create(@RequestBody WorkEffortCostCalc entity) {
        WorkEffortCostCalc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortCostCalc update(@PathVariable Long id, @RequestBody WorkEffortCostCalc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}