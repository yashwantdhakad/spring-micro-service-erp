package com.example.erp.mfg.ofbiz.controller;

import com.example.erp.mfg.ofbiz.domain.WorkEffortDeliverableProd;
import com.example.erp.mfg.ofbiz.service.WorkEffortDeliverableProdService;
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
@RequestMapping("/ofbiz/work-effort-deliverable-prods")
public class WorkEffortDeliverableProdController {

    private final WorkEffortDeliverableProdService service;

    public WorkEffortDeliverableProdController(WorkEffortDeliverableProdService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortDeliverableProd> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortDeliverableProd get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortDeliverableProd> create(@RequestBody WorkEffortDeliverableProd entity) {
        WorkEffortDeliverableProd created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortDeliverableProd update(@PathVariable Long id, @RequestBody WorkEffortDeliverableProd entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}