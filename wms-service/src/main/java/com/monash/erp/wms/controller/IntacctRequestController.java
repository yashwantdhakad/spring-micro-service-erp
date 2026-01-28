package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.IntacctRequest;
import com.monash.erp.wms.service.IntacctRequestService;
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
@RequestMapping("/api/intacct-requests")
public class IntacctRequestController {

    private final IntacctRequestService service;

    public IntacctRequestController(IntacctRequestService service) {
        this.service = service;
    }

    @GetMapping
    public List<IntacctRequest> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public IntacctRequest get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<IntacctRequest> create(@RequestBody IntacctRequest entity) {
        IntacctRequest created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public IntacctRequest update(@PathVariable Long id, @RequestBody IntacctRequest entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}