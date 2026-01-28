package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PriorityType;
import com.monash.erp.wms.service.PriorityTypeService;
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
@RequestMapping("/api/priority-types")
public class PriorityTypeController {

    private final PriorityTypeService service;

    public PriorityTypeController(PriorityTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PriorityType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PriorityType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PriorityType> create(@RequestBody PriorityType entity) {
        PriorityType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PriorityType update(@PathVariable Long id, @RequestBody PriorityType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}