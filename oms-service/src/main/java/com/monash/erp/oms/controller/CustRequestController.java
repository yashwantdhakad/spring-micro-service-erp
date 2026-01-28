package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequest;
import com.monash.erp.oms.service.CustRequestService;
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
@RequestMapping("/api/cust-requests")
public class CustRequestController {

    private final CustRequestService service;

    public CustRequestController(CustRequestService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequest> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequest get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequest> create(@RequestBody CustRequest entity) {
        CustRequest created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequest update(@PathVariable Long id, @RequestBody CustRequest entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}