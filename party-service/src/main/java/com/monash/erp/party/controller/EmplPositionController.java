package com.monash.erp.party.controller;

import com.monash.erp.party.entity.EmplPosition;
import com.monash.erp.party.service.EmplPositionService;
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
@RequestMapping("/api/empl-positions")
public class EmplPositionController {

    private final EmplPositionService service;

    public EmplPositionController(EmplPositionService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmplPosition> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EmplPosition get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EmplPosition> create(@RequestBody EmplPosition entity) {
        EmplPosition created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EmplPosition update(@PathVariable Long id, @RequestBody EmplPosition entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}