package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.TerminationReason;
import com.monash.erp.wms.service.TerminationReasonService;
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
@RequestMapping("/api/termination-reasons")
public class TerminationReasonController {

    private final TerminationReasonService service;

    public TerminationReasonController(TerminationReasonService service) {
        this.service = service;
    }

    @GetMapping
    public List<TerminationReason> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TerminationReason get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TerminationReason> create(@RequestBody TerminationReason entity) {
        TerminationReason created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TerminationReason update(@PathVariable Long id, @RequestBody TerminationReason entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}