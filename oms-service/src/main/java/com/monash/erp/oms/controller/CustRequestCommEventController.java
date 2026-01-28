package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequestCommEvent;
import com.monash.erp.oms.service.CustRequestCommEventService;
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
@RequestMapping("/api/cust-request-comm-events")
public class CustRequestCommEventController {

    private final CustRequestCommEventService service;

    public CustRequestCommEventController(CustRequestCommEventService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequestCommEvent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequestCommEvent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequestCommEvent> create(@RequestBody CustRequestCommEvent entity) {
        CustRequestCommEvent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequestCommEvent update(@PathVariable Long id, @RequestBody CustRequestCommEvent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}