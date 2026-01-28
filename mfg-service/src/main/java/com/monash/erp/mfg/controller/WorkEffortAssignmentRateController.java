package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortAssignmentRate;
import com.monash.erp.mfg.service.WorkEffortAssignmentRateService;
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
@RequestMapping("/api/work-effort-assignment-rates")
public class WorkEffortAssignmentRateController {

    private final WorkEffortAssignmentRateService service;

    public WorkEffortAssignmentRateController(WorkEffortAssignmentRateService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortAssignmentRate> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortAssignmentRate get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortAssignmentRate> create(@RequestBody WorkEffortAssignmentRate entity) {
        WorkEffortAssignmentRate created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortAssignmentRate update(@PathVariable Long id, @RequestBody WorkEffortAssignmentRate entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}