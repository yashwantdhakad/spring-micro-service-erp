package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.StatusValidChange;
import com.monash.erp.oms.common.service.StatusValidChangeService;
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
@RequestMapping("/api/common/status-valid-changes")
public class StatusValidChangeController {

    private final StatusValidChangeService service;

    public StatusValidChangeController(StatusValidChangeService service) {
        this.service = service;
    }

    @GetMapping
    public List<StatusValidChange> list() {
        return service.list();
    }

    @GetMapping("/by-status/{statusId}")
    public List<StatusValidChange> getValidChanges(@PathVariable String statusId) {
        return service.getValidChanges(statusId);
    }

    @GetMapping("/{id}")
    public StatusValidChange get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<StatusValidChange> create(@RequestBody StatusValidChange entity) {
        StatusValidChange created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public StatusValidChange update(@PathVariable Long id, @RequestBody StatusValidChange entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
