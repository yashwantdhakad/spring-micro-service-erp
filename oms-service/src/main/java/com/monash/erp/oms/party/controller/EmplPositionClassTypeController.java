package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.EmplPositionClassType;
import com.monash.erp.oms.party.service.EmplPositionClassTypeService;
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
@RequestMapping("/api/empl-position-class-types")
public class EmplPositionClassTypeController {

    private final EmplPositionClassTypeService service;

    public EmplPositionClassTypeController(EmplPositionClassTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmplPositionClassType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EmplPositionClassType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EmplPositionClassType> create(@RequestBody EmplPositionClassType entity) {
        EmplPositionClassType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EmplPositionClassType update(@PathVariable Long id, @RequestBody EmplPositionClassType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}