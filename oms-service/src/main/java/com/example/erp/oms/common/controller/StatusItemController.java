package com.example.erp.oms.common.controller;

import com.example.erp.oms.common.domain.StatusItem;
import com.example.erp.oms.common.service.StatusItemService;
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
@RequestMapping("/common/status-items")
public class StatusItemController {

    private final StatusItemService service;

    public StatusItemController(StatusItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<StatusItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public StatusItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<StatusItem> create(@RequestBody StatusItem entity) {
        StatusItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public StatusItem update(@PathVariable Long id, @RequestBody StatusItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
