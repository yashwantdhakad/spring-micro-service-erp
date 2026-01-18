package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityContactMechPurpose;
import com.monash.erp.wms.service.FacilityContactMechPurposeService;
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
@RequestMapping("/api/facility-contact-mech-purposes")
public class FacilityContactMechPurposeController {

    private final FacilityContactMechPurposeService service;

    public FacilityContactMechPurposeController(FacilityContactMechPurposeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityContactMechPurpose> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityContactMechPurpose get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityContactMechPurpose> create(@RequestBody FacilityContactMechPurpose entity) {
        FacilityContactMechPurpose created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityContactMechPurpose update(@PathVariable Long id, @RequestBody FacilityContactMechPurpose entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}