package com.example.erp.mfg.ofbiz.controller;

import com.example.erp.mfg.ofbiz.domain.WorkEffortAssocType;
import com.example.erp.mfg.ofbiz.service.WorkEffortAssocTypeService;
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
@RequestMapping("/ofbiz/work-effort-assoc-types")
public class WorkEffortAssocTypeController {

    private final WorkEffortAssocTypeService service;

    public WorkEffortAssocTypeController(WorkEffortAssocTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortAssocType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortAssocType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortAssocType> create(@RequestBody WorkEffortAssocType entity) {
        WorkEffortAssocType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortAssocType update(@PathVariable Long id, @RequestBody WorkEffortAssocType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}