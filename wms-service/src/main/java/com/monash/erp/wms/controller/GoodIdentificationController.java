package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.GoodIdentification;
import com.monash.erp.wms.service.GoodIdentificationService;
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
@RequestMapping("/ofbiz/good-identifications")
public class GoodIdentificationController {

    private final GoodIdentificationService service;

    public GoodIdentificationController(GoodIdentificationService service) {
        this.service = service;
    }

    @GetMapping
    public List<GoodIdentification> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GoodIdentification get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GoodIdentification> create(@RequestBody GoodIdentification entity) {
        GoodIdentification created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GoodIdentification update(@PathVariable Long id, @RequestBody GoodIdentification entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}