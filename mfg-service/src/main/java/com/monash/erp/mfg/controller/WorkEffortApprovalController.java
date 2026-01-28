package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortApproval;
import com.monash.erp.mfg.service.WorkEffortApprovalService;
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
@RequestMapping("/api/work-effort-approvals")
public class WorkEffortApprovalController {

    private final WorkEffortApprovalService service;

    public WorkEffortApprovalController(WorkEffortApprovalService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortApproval> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortApproval get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortApproval> create(@RequestBody WorkEffortApproval entity) {
        WorkEffortApproval created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortApproval update(@PathVariable Long id, @RequestBody WorkEffortApproval entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}