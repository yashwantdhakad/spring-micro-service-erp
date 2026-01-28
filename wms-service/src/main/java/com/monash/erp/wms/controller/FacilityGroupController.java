package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityGroup;
import com.monash.erp.wms.service.FacilityGroupService;
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
@RequestMapping("/api/facility-groups")
public class FacilityGroupController {

    private final FacilityGroupService service;

    public FacilityGroupController(FacilityGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityGroup> create(@RequestBody FacilityGroup entity) {
        FacilityGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityGroup update(@PathVariable Long id, @RequestBody FacilityGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}