package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.Picklist;
import com.example.erp.wms.ofbiz.service.PicklistService;
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
@RequestMapping("/ofbiz/picklists")
public class PicklistController {

    private final PicklistService service;

    public PicklistController(PicklistService service) {
        this.service = service;
    }

    @GetMapping
    public List<Picklist> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Picklist get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Picklist> create(@RequestBody Picklist entity) {
        Picklist created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Picklist update(@PathVariable Long id, @RequestBody Picklist entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}