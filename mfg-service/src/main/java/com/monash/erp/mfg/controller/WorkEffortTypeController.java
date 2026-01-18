package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortType;
import com.monash.erp.mfg.service.WorkEffortTypeService;
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
@RequestMapping("/ofbiz/work-effort-types")
public class WorkEffortTypeController {

    private final WorkEffortTypeService service;

    public WorkEffortTypeController(WorkEffortTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortType> create(@RequestBody WorkEffortType entity) {
        WorkEffortType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortType update(@PathVariable Long id, @RequestBody WorkEffortType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}