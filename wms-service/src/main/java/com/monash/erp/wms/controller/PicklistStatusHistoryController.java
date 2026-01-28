package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PicklistStatusHistory;
import com.monash.erp.wms.service.PicklistStatusHistoryService;
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
@RequestMapping("/api/picklist-status-histories")
public class PicklistStatusHistoryController {

    private final PicklistStatusHistoryService service;

    public PicklistStatusHistoryController(PicklistStatusHistoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<PicklistStatusHistory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PicklistStatusHistory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PicklistStatusHistory> create(@RequestBody PicklistStatusHistory entity) {
        PicklistStatusHistory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PicklistStatusHistory update(@PathVariable Long id, @RequestBody PicklistStatusHistory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}