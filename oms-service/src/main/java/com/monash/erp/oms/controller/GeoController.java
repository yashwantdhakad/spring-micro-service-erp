package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.Geo;
import com.monash.erp.oms.service.GeoService;
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
@RequestMapping("/api/geos")
public class GeoController {

    private final GeoService service;

    public GeoController(GeoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Geo> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Geo get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Geo> create(@RequestBody Geo entity) {
        Geo created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Geo update(@PathVariable Long id, @RequestBody Geo entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}