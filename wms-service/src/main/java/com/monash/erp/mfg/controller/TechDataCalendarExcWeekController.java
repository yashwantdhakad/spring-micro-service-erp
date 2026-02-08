package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.TechDataCalendarExcWeek;
import com.monash.erp.mfg.service.TechDataCalendarExcWeekService;
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
@RequestMapping("/api/tech-data-calendar-exc-weeks")
public class TechDataCalendarExcWeekController {

    private final TechDataCalendarExcWeekService service;

    public TechDataCalendarExcWeekController(TechDataCalendarExcWeekService service) {
        this.service = service;
    }

    @GetMapping
    public List<TechDataCalendarExcWeek> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TechDataCalendarExcWeek get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TechDataCalendarExcWeek> create(@RequestBody TechDataCalendarExcWeek entity) {
        TechDataCalendarExcWeek created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TechDataCalendarExcWeek update(@PathVariable Long id, @RequestBody TechDataCalendarExcWeek entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}