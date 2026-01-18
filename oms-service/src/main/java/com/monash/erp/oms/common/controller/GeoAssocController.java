package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.GeoAssoc;
import com.monash.erp.oms.common.service.GeoAssocService;
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
@RequestMapping("/common/geo-assocs")
public class GeoAssocController {

    private final GeoAssocService service;

    public GeoAssocController(GeoAssocService service) {
        this.service = service;
    }

    @GetMapping
    public List<GeoAssoc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GeoAssoc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GeoAssoc> create(@RequestBody GeoAssoc entity) {
        GeoAssoc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GeoAssoc update(@PathVariable Long id, @RequestBody GeoAssoc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
