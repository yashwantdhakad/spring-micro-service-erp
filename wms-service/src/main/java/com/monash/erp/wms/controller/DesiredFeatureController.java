package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DesiredFeature;
import com.monash.erp.wms.service.DesiredFeatureService;
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
@RequestMapping("/api/desired-features")
public class DesiredFeatureController {

    private final DesiredFeatureService service;

    public DesiredFeatureController(DesiredFeatureService service) {
        this.service = service;
    }

    @GetMapping
    public List<DesiredFeature> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DesiredFeature get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DesiredFeature> create(@RequestBody DesiredFeature entity) {
        DesiredFeature created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DesiredFeature update(@PathVariable Long id, @RequestBody DesiredFeature entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}