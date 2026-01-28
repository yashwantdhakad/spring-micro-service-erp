package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityDimension;
import com.monash.erp.wms.service.FacilityDimensionService;
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
@RequestMapping("/api/facility-dimensions")
public class FacilityDimensionController {

    private final FacilityDimensionService service;

    public FacilityDimensionController(FacilityDimensionService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityDimension> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityDimension get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityDimension> create(@RequestBody FacilityDimension entity) {
        FacilityDimension created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityDimension update(@PathVariable Long id, @RequestBody FacilityDimension entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}