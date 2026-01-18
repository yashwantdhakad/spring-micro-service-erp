package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityLocation;
import com.monash.erp.wms.service.FacilityLocationService;
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
@RequestMapping("/api/facility-locations")
public class FacilityLocationController {

    private final FacilityLocationService service;

    public FacilityLocationController(FacilityLocationService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityLocation> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityLocation get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityLocation> create(@RequestBody FacilityLocation entity) {
        FacilityLocation created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityLocation update(@PathVariable Long id, @RequestBody FacilityLocation entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}