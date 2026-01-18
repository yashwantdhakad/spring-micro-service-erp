package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortAssoc;
import com.monash.erp.mfg.service.WorkEffortAssocService;
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
@RequestMapping("/ofbiz/work-effort-assocs")
public class WorkEffortAssocController {

    private final WorkEffortAssocService service;

    public WorkEffortAssocController(WorkEffortAssocService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortAssoc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortAssoc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortAssoc> create(@RequestBody WorkEffortAssoc entity) {
        WorkEffortAssoc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortAssoc update(@PathVariable Long id, @RequestBody WorkEffortAssoc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}