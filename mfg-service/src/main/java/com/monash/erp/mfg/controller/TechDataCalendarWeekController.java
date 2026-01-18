package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.TechDataCalendarWeek;
import com.monash.erp.mfg.service.TechDataCalendarWeekService;
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
@RequestMapping("/ofbiz/tech-data-calendar-weeks")
public class TechDataCalendarWeekController {

    private final TechDataCalendarWeekService service;

    public TechDataCalendarWeekController(TechDataCalendarWeekService service) {
        this.service = service;
    }

    @GetMapping
    public List<TechDataCalendarWeek> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TechDataCalendarWeek get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TechDataCalendarWeek> create(@RequestBody TechDataCalendarWeek entity) {
        TechDataCalendarWeek created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TechDataCalendarWeek update(@PathVariable Long id, @RequestBody TechDataCalendarWeek entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}