package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityGroupRollup;
import com.monash.erp.wms.service.FacilityGroupRollupService;
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
@RequestMapping("/api/facility-group-rollups")
public class FacilityGroupRollupController {

    private final FacilityGroupRollupService service;

    public FacilityGroupRollupController(FacilityGroupRollupService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityGroupRollup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityGroupRollup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityGroupRollup> create(@RequestBody FacilityGroupRollup entity) {
        FacilityGroupRollup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityGroupRollup update(@PathVariable Long id, @RequestBody FacilityGroupRollup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}