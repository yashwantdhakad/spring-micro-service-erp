package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FinAccountTransType;
import com.monash.erp.oms.accounting.service.FinAccountTransTypeService;
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
@RequestMapping("/accounting/fin-account-trans-types")
public class FinAccountTransTypeController {

    private final FinAccountTransTypeService service;

    public FinAccountTransTypeController(FinAccountTransTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinAccountTransType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FinAccountTransType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FinAccountTransType> create(@RequestBody FinAccountTransType entity) {
        FinAccountTransType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FinAccountTransType update(@PathVariable Long id, @RequestBody FinAccountTransType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
