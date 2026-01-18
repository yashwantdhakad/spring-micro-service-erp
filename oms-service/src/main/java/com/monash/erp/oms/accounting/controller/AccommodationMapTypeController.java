package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.AccommodationMapType;
import com.monash.erp.oms.accounting.service.AccommodationMapTypeService;
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
@RequestMapping("/accounting/accommodation-map-types")
public class AccommodationMapTypeController {

    private final AccommodationMapTypeService service;

    public AccommodationMapTypeController(AccommodationMapTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<AccommodationMapType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AccommodationMapType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AccommodationMapType> create(@RequestBody AccommodationMapType entity) {
        AccommodationMapType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AccommodationMapType update(@PathVariable Long id, @RequestBody AccommodationMapType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
