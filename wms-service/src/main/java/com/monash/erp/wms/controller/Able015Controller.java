package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.Able015;
import com.monash.erp.wms.service.Able015Service;
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
@RequestMapping("/api/able015s")
public class Able015Controller {

    private final Able015Service service;

    public Able015Controller(Able015Service service) {
        this.service = service;
    }

    @GetMapping
    public List<Able015> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Able015 get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Able015> create(@RequestBody Able015 entity) {
        Able015 created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Able015 update(@PathVariable Long id, @RequestBody Able015 entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}