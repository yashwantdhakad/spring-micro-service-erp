package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityLocationGeoPoint;
import com.monash.erp.wms.service.FacilityLocationGeoPointService;
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
@RequestMapping("/api/facility-location-geo-points")
public class FacilityLocationGeoPointController {

    private final FacilityLocationGeoPointService service;

    public FacilityLocationGeoPointController(FacilityLocationGeoPointService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityLocationGeoPoint> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityLocationGeoPoint get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityLocationGeoPoint> create(@RequestBody FacilityLocationGeoPoint entity) {
        FacilityLocationGeoPoint created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityLocationGeoPoint update(@PathVariable Long id, @RequestBody FacilityLocationGeoPoint entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}