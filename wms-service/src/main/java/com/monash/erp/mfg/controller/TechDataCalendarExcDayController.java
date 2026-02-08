package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.TechDataCalendarExcDay;
import com.monash.erp.mfg.service.TechDataCalendarExcDayService;
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
@RequestMapping("/api/tech-data-calendar-exc-days")
public class TechDataCalendarExcDayController {

    private final TechDataCalendarExcDayService service;

    public TechDataCalendarExcDayController(TechDataCalendarExcDayService service) {
        this.service = service;
    }

    @GetMapping
    public List<TechDataCalendarExcDay> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TechDataCalendarExcDay get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TechDataCalendarExcDay> create(@RequestBody TechDataCalendarExcDay entity) {
        TechDataCalendarExcDay created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TechDataCalendarExcDay update(@PathVariable Long id, @RequestBody TechDataCalendarExcDay entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}