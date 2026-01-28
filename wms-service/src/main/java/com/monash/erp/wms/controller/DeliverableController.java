package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.Deliverable;
import com.monash.erp.wms.service.DeliverableService;
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
@RequestMapping("/api/deliverables")
public class DeliverableController {

    private final DeliverableService service;

    public DeliverableController(DeliverableService service) {
        this.service = service;
    }

    @GetMapping
    public List<Deliverable> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Deliverable get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Deliverable> create(@RequestBody Deliverable entity) {
        Deliverable created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Deliverable update(@PathVariable Long id, @RequestBody Deliverable entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}