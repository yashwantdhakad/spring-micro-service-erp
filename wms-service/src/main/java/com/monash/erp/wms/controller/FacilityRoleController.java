package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityRole;
import com.monash.erp.wms.service.FacilityRoleService;
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
@RequestMapping("/api/facility-roles")
public class FacilityRoleController {

    private final FacilityRoleService service;

    public FacilityRoleController(FacilityRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityRole> create(@RequestBody FacilityRole entity) {
        FacilityRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityRole update(@PathVariable Long id, @RequestBody FacilityRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}