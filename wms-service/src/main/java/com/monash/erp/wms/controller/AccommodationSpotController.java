package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.AccommodationSpot;
import com.monash.erp.wms.service.AccommodationSpotService;
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
@RequestMapping("/api/accommodation-spots")
public class AccommodationSpotController {

    private final AccommodationSpotService service;

    public AccommodationSpotController(AccommodationSpotService service) {
        this.service = service;
    }

    @GetMapping
    public List<AccommodationSpot> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AccommodationSpot get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AccommodationSpot> create(@RequestBody AccommodationSpot entity) {
        AccommodationSpot created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AccommodationSpot update(@PathVariable Long id, @RequestBody AccommodationSpot entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}