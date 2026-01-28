package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContainerGeoPoint;
import com.monash.erp.wms.service.ContainerGeoPointService;
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
@RequestMapping("/api/container-geo-points")
public class ContainerGeoPointController {

    private final ContainerGeoPointService service;

    public ContainerGeoPointController(ContainerGeoPointService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContainerGeoPoint> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContainerGeoPoint get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContainerGeoPoint> create(@RequestBody ContainerGeoPoint entity) {
        ContainerGeoPoint created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContainerGeoPoint update(@PathVariable Long id, @RequestBody ContainerGeoPoint entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}