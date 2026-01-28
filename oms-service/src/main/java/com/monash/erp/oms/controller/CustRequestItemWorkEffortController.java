package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequestItemWorkEffort;
import com.monash.erp.oms.service.CustRequestItemWorkEffortService;
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
@RequestMapping("/api/cust-request-item-work-efforts")
public class CustRequestItemWorkEffortController {

    private final CustRequestItemWorkEffortService service;

    public CustRequestItemWorkEffortController(CustRequestItemWorkEffortService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequestItemWorkEffort> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequestItemWorkEffort get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequestItemWorkEffort> create(@RequestBody CustRequestItemWorkEffort entity) {
        CustRequestItemWorkEffort created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequestItemWorkEffort update(@PathVariable Long id, @RequestBody CustRequestItemWorkEffort entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}