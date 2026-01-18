package com.monash.erp.party.controller;

import com.monash.erp.party.entity.TelecomNumber;
import com.monash.erp.party.service.TelecomNumberService;
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
@RequestMapping("/ofbiz/telecom-numbers")
public class TelecomNumberController {

    private final TelecomNumberService service;

    public TelecomNumberController(TelecomNumberService service) {
        this.service = service;
    }

    @GetMapping
    public List<TelecomNumber> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TelecomNumber get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TelecomNumber> create(@RequestBody TelecomNumber entity) {
        TelecomNumber created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TelecomNumber update(@PathVariable Long id, @RequestBody TelecomNumber entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}