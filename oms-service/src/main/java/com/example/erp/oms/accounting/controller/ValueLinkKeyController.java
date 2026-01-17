package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.ValueLinkKey;
import com.example.erp.oms.accounting.service.ValueLinkKeyService;
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
@RequestMapping("/accounting/value-link-keys")
public class ValueLinkKeyController {

    private final ValueLinkKeyService service;

    public ValueLinkKeyController(ValueLinkKeyService service) {
        this.service = service;
    }

    @GetMapping
    public List<ValueLinkKey> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ValueLinkKey get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ValueLinkKey> create(@RequestBody ValueLinkKey entity) {
        ValueLinkKey created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ValueLinkKey update(@PathVariable Long id, @RequestBody ValueLinkKey entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
