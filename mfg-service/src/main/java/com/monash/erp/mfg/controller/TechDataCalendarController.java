package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.TechDataCalendar;
import com.monash.erp.mfg.service.TechDataCalendarService;
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
@RequestMapping("/ofbiz/tech-data-calendars")
public class TechDataCalendarController {

    private final TechDataCalendarService service;

    public TechDataCalendarController(TechDataCalendarService service) {
        this.service = service;
    }

    @GetMapping
    public List<TechDataCalendar> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TechDataCalendar get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TechDataCalendar> create(@RequestBody TechDataCalendar entity) {
        TechDataCalendar created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TechDataCalendar update(@PathVariable Long id, @RequestBody TechDataCalendar entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}