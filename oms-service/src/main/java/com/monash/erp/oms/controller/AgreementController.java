package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.Agreement;
import com.monash.erp.oms.service.AgreementService;
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
@RequestMapping("/api/agreements")
public class AgreementController {

    private final AgreementService service;

    public AgreementController(AgreementService service) {
        this.service = service;
    }

    @GetMapping
    public List<Agreement> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Agreement get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Agreement> create(@RequestBody Agreement entity) {
        Agreement created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Agreement update(@PathVariable Long id, @RequestBody Agreement entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}