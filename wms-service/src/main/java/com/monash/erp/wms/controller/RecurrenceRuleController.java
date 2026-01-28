package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.RecurrenceRule;
import com.monash.erp.wms.service.RecurrenceRuleService;
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
@RequestMapping("/api/recurrence-rules")
public class RecurrenceRuleController {

    private final RecurrenceRuleService service;

    public RecurrenceRuleController(RecurrenceRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<RecurrenceRule> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RecurrenceRule get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RecurrenceRule> create(@RequestBody RecurrenceRule entity) {
        RecurrenceRule created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RecurrenceRule update(@PathVariable Long id, @RequestBody RecurrenceRule entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}