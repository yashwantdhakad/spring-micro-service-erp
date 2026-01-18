package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityType;
import com.monash.erp.wms.service.FacilityTypeService;
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
@RequestMapping("/api/facility-types")
public class FacilityTypeController {

    private final FacilityTypeService service;

    public FacilityTypeController(FacilityTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityType> create(@RequestBody FacilityType entity) {
        FacilityType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityType update(@PathVariable Long id, @RequestBody FacilityType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}