package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityContactMech;
import com.monash.erp.wms.service.FacilityContactMechService;
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
@RequestMapping("/api/facility-contact-mechs")
public class FacilityContactMechController {

    private final FacilityContactMechService service;

    public FacilityContactMechController(FacilityContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityContactMech> list() {
        return service.list();
    }

    @GetMapping("/by-facility/{facilityId}")
    public List<FacilityContactMech> listByFacility(@PathVariable String facilityId) {
        return service.listByFacilityId(facilityId);
    }

    @GetMapping("/{id}")
    public FacilityContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityContactMech> create(@RequestBody FacilityContactMech entity) {
        FacilityContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityContactMech update(@PathVariable Long id, @RequestBody FacilityContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
