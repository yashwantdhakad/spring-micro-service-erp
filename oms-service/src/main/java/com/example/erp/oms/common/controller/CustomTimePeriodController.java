package com.example.erp.oms.common.controller;

import com.example.erp.oms.common.domain.CustomTimePeriod;
import com.example.erp.oms.common.service.CustomTimePeriodService;
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
@RequestMapping("/common/custom-time-periods")
public class CustomTimePeriodController {

    private final CustomTimePeriodService service;

    public CustomTimePeriodController(CustomTimePeriodService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomTimePeriod> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustomTimePeriod get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustomTimePeriod> create(@RequestBody CustomTimePeriod entity) {
        CustomTimePeriod created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustomTimePeriod update(@PathVariable Long id, @RequestBody CustomTimePeriod entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
