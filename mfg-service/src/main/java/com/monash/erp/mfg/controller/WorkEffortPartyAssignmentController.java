package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortPartyAssignment;
import com.monash.erp.mfg.service.WorkEffortPartyAssignmentService;
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
@RequestMapping("/ofbiz/work-effort-party-assignments")
public class WorkEffortPartyAssignmentController {

    private final WorkEffortPartyAssignmentService service;

    public WorkEffortPartyAssignmentController(WorkEffortPartyAssignmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortPartyAssignment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortPartyAssignment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortPartyAssignment> create(@RequestBody WorkEffortPartyAssignment entity) {
        WorkEffortPartyAssignment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortPartyAssignment update(@PathVariable Long id, @RequestBody WorkEffortPartyAssignment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}