package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SettlementTerm;
import com.monash.erp.wms.service.SettlementTermService;
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
@RequestMapping("/api/settlement-terms")
public class SettlementTermController {

    private final SettlementTermService service;

    public SettlementTermController(SettlementTermService service) {
        this.service = service;
    }

    @GetMapping
    public List<SettlementTerm> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SettlementTerm get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SettlementTerm> create(@RequestBody SettlementTerm entity) {
        SettlementTerm created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SettlementTerm update(@PathVariable Long id, @RequestBody SettlementTerm entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}