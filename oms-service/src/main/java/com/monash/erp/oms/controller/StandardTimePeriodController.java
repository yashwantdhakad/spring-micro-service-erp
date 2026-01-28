package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.StandardTimePeriod;
import com.monash.erp.oms.service.StandardTimePeriodService;
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
@RequestMapping("/api/standard-time-periods")
public class StandardTimePeriodController {

    private final StandardTimePeriodService service;

    public StandardTimePeriodController(StandardTimePeriodService service) {
        this.service = service;
    }

    @GetMapping
    public List<StandardTimePeriod> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public StandardTimePeriod get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<StandardTimePeriod> create(@RequestBody StandardTimePeriod entity) {
        StandardTimePeriod created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public StandardTimePeriod update(@PathVariable Long id, @RequestBody StandardTimePeriod entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}