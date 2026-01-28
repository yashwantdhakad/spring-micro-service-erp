package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.AbleTrace;
import com.monash.erp.wms.service.AbleTraceService;
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
@RequestMapping("/api/able-traces")
public class AbleTraceController {

    private final AbleTraceService service;

    public AbleTraceController(AbleTraceService service) {
        this.service = service;
    }

    @GetMapping
    public List<AbleTrace> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AbleTrace get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AbleTrace> create(@RequestBody AbleTrace entity) {
        AbleTrace created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AbleTrace update(@PathVariable Long id, @RequestBody AbleTrace entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}