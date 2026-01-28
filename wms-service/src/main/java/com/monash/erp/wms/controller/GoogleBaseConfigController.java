package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.GoogleBaseConfig;
import com.monash.erp.wms.service.GoogleBaseConfigService;
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
@RequestMapping("/api/google-base-configs")
public class GoogleBaseConfigController {

    private final GoogleBaseConfigService service;

    public GoogleBaseConfigController(GoogleBaseConfigService service) {
        this.service = service;
    }

    @GetMapping
    public List<GoogleBaseConfig> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GoogleBaseConfig get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GoogleBaseConfig> create(@RequestBody GoogleBaseConfig entity) {
        GoogleBaseConfig created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GoogleBaseConfig update(@PathVariable Long id, @RequestBody GoogleBaseConfig entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}