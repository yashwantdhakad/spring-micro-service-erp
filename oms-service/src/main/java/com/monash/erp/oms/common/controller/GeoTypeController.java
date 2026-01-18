package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.GeoType;
import com.monash.erp.oms.common.service.GeoTypeService;
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
@RequestMapping("/api/common/geo-types")
public class GeoTypeController {

    private final GeoTypeService service;

    public GeoTypeController(GeoTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<GeoType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GeoType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GeoType> create(@RequestBody GeoType entity) {
        GeoType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GeoType update(@PathVariable Long id, @RequestBody GeoType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
