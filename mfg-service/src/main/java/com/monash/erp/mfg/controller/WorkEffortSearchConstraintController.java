package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortSearchConstraint;
import com.monash.erp.mfg.service.WorkEffortSearchConstraintService;
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
@RequestMapping("/api/work-effort-search-constraints")
public class WorkEffortSearchConstraintController {

    private final WorkEffortSearchConstraintService service;

    public WorkEffortSearchConstraintController(WorkEffortSearchConstraintService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortSearchConstraint> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortSearchConstraint get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortSearchConstraint> create(@RequestBody WorkEffortSearchConstraint entity) {
        WorkEffortSearchConstraint created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortSearchConstraint update(@PathVariable Long id, @RequestBody WorkEffortSearchConstraint entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}