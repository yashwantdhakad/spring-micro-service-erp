package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.GoogleCoConfiguration;
import com.monash.erp.wms.service.GoogleCoConfigurationService;
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
@RequestMapping("/api/google-co-configurations")
public class GoogleCoConfigurationController {

    private final GoogleCoConfigurationService service;

    public GoogleCoConfigurationController(GoogleCoConfigurationService service) {
        this.service = service;
    }

    @GetMapping
    public List<GoogleCoConfiguration> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GoogleCoConfiguration get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GoogleCoConfiguration> create(@RequestBody GoogleCoConfiguration entity) {
        GoogleCoConfiguration created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GoogleCoConfiguration update(@PathVariable Long id, @RequestBody GoogleCoConfiguration entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}