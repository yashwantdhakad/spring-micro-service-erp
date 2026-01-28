package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityTypeAttr;
import com.monash.erp.wms.service.FacilityTypeAttrService;
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
@RequestMapping("/api/facility-type-attrs")
public class FacilityTypeAttrController {

    private final FacilityTypeAttrService service;

    public FacilityTypeAttrController(FacilityTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityTypeAttr> create(@RequestBody FacilityTypeAttr entity) {
        FacilityTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityTypeAttr update(@PathVariable Long id, @RequestBody FacilityTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}