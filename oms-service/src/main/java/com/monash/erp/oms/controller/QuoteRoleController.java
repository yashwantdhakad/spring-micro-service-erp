package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.QuoteRole;
import com.monash.erp.oms.service.QuoteRoleService;
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
@RequestMapping("/api/quote-roles")
public class QuoteRoleController {

    private final QuoteRoleService service;

    public QuoteRoleController(QuoteRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuoteRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuoteRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuoteRole> create(@RequestBody QuoteRole entity) {
        QuoteRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuoteRole update(@PathVariable Long id, @RequestBody QuoteRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}