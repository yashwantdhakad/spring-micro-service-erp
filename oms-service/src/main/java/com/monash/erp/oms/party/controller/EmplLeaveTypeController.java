package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.EmplLeaveType;
import com.monash.erp.oms.party.service.EmplLeaveTypeService;
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
@RequestMapping("/api/empl-leave-types")
public class EmplLeaveTypeController {

    private final EmplLeaveTypeService service;

    public EmplLeaveTypeController(EmplLeaveTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmplLeaveType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EmplLeaveType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EmplLeaveType> create(@RequestBody EmplLeaveType entity) {
        EmplLeaveType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EmplLeaveType update(@PathVariable Long id, @RequestBody EmplLeaveType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}