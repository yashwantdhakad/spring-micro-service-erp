package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.AccommodationClass;
import com.monash.erp.wms.service.AccommodationClassService;
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
@RequestMapping("/api/accommodation-classes")
public class AccommodationClassController {

    private final AccommodationClassService service;

    public AccommodationClassController(AccommodationClassService service) {
        this.service = service;
    }

    @GetMapping
    public List<AccommodationClass> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AccommodationClass get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AccommodationClass> create(@RequestBody AccommodationClass entity) {
        AccommodationClass created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AccommodationClass update(@PathVariable Long id, @RequestBody AccommodationClass entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}