package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.AbleQual;
import com.monash.erp.wms.service.AbleQualService;
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
@RequestMapping("/api/able-quals")
public class AbleQualController {

    private final AbleQualService service;

    public AbleQualController(AbleQualService service) {
        this.service = service;
    }

    @GetMapping
    public List<AbleQual> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AbleQual get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AbleQual> create(@RequestBody AbleQual entity) {
        AbleQual created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AbleQual update(@PathVariable Long id, @RequestBody AbleQual entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}