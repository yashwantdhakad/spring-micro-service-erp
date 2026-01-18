package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortFixedAssetAssign;
import com.monash.erp.mfg.service.WorkEffortFixedAssetAssignService;
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
@RequestMapping("/ofbiz/work-effort-fixed-asset-assigns")
public class WorkEffortFixedAssetAssignController {

    private final WorkEffortFixedAssetAssignService service;

    public WorkEffortFixedAssetAssignController(WorkEffortFixedAssetAssignService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortFixedAssetAssign> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortFixedAssetAssign get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortFixedAssetAssign> create(@RequestBody WorkEffortFixedAssetAssign entity) {
        WorkEffortFixedAssetAssign created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortFixedAssetAssign update(@PathVariable Long id, @RequestBody WorkEffortFixedAssetAssign entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}