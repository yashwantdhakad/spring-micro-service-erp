package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.EmplPositionReportingStruct;
import com.monash.erp.oms.party.service.EmplPositionReportingStructService;
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
@RequestMapping("/api/empl-position-reporting-structs")
public class EmplPositionReportingStructController {

    private final EmplPositionReportingStructService service;

    public EmplPositionReportingStructController(EmplPositionReportingStructService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmplPositionReportingStruct> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EmplPositionReportingStruct get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EmplPositionReportingStruct> create(@RequestBody EmplPositionReportingStruct entity) {
        EmplPositionReportingStruct created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EmplPositionReportingStruct update(@PathVariable Long id, @RequestBody EmplPositionReportingStruct entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}