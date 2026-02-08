package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.EmplPositionResponsibility;
import com.monash.erp.oms.party.service.EmplPositionResponsibilityService;
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
@RequestMapping("/api/empl-position-responsibilities")
public class EmplPositionResponsibilityController {

    private final EmplPositionResponsibilityService service;

    public EmplPositionResponsibilityController(EmplPositionResponsibilityService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmplPositionResponsibility> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EmplPositionResponsibility get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EmplPositionResponsibility> create(@RequestBody EmplPositionResponsibility entity) {
        EmplPositionResponsibility created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EmplPositionResponsibility update(@PathVariable Long id, @RequestBody EmplPositionResponsibility entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
