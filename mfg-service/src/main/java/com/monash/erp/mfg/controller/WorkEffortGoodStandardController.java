package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortGoodStandard;
import com.monash.erp.mfg.service.WorkEffortGoodStandardService;
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
@RequestMapping("/ofbiz/work-effort-good-standards")
public class WorkEffortGoodStandardController {

    private final WorkEffortGoodStandardService service;

    public WorkEffortGoodStandardController(WorkEffortGoodStandardService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortGoodStandard> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortGoodStandard get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortGoodStandard> create(@RequestBody WorkEffortGoodStandard entity) {
        WorkEffortGoodStandard created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortGoodStandard update(@PathVariable Long id, @RequestBody WorkEffortGoodStandard entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}