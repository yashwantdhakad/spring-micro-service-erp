package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortContactMech;
import com.monash.erp.mfg.service.WorkEffortContactMechService;
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
@RequestMapping("/api/work-effort-contact-mechs")
public class WorkEffortContactMechController {

    private final WorkEffortContactMechService service;

    public WorkEffortContactMechController(WorkEffortContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortContactMech> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortContactMech> create(@RequestBody WorkEffortContactMech entity) {
        WorkEffortContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortContactMech update(@PathVariable Long id, @RequestBody WorkEffortContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}