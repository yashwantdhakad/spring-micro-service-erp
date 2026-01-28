package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DateDimension;
import com.monash.erp.wms.service.DateDimensionService;
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
@RequestMapping("/api/date-dimensions")
public class DateDimensionController {

    private final DateDimensionService service;

    public DateDimensionController(DateDimensionService service) {
        this.service = service;
    }

    @GetMapping
    public List<DateDimension> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DateDimension get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DateDimension> create(@RequestBody DateDimension entity) {
        DateDimension created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DateDimension update(@PathVariable Long id, @RequestBody DateDimension entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}