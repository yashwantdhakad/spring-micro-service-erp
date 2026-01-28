package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.RecurrenceInfo;
import com.monash.erp.wms.service.RecurrenceInfoService;
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
@RequestMapping("/api/recurrence-infos")
public class RecurrenceInfoController {

    private final RecurrenceInfoService service;

    public RecurrenceInfoController(RecurrenceInfoService service) {
        this.service = service;
    }

    @GetMapping
    public List<RecurrenceInfo> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RecurrenceInfo get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RecurrenceInfo> create(@RequestBody RecurrenceInfo entity) {
        RecurrenceInfo created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RecurrenceInfo update(@PathVariable Long id, @RequestBody RecurrenceInfo entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}