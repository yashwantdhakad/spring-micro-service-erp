package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortFixedAssetStd;
import com.monash.erp.mfg.service.WorkEffortFixedAssetStdService;
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
@RequestMapping("/ofbiz/work-effort-fixed-asset-stds")
public class WorkEffortFixedAssetStdController {

    private final WorkEffortFixedAssetStdService service;

    public WorkEffortFixedAssetStdController(WorkEffortFixedAssetStdService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortFixedAssetStd> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortFixedAssetStd get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortFixedAssetStd> create(@RequestBody WorkEffortFixedAssetStd entity) {
        WorkEffortFixedAssetStd created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortFixedAssetStd update(@PathVariable Long id, @RequestBody WorkEffortFixedAssetStd entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}