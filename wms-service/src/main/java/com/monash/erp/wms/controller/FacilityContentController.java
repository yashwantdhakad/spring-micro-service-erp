package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.FacilityContent;
import com.monash.erp.wms.service.FacilityContentService;
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
@RequestMapping("/ofbiz/facility-contents")
public class FacilityContentController {

    private final FacilityContentService service;

    public FacilityContentController(FacilityContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FacilityContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FacilityContent> create(@RequestBody FacilityContent entity) {
        FacilityContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FacilityContent update(@PathVariable Long id, @RequestBody FacilityContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}