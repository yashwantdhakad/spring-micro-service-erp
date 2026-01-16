package com.example.erp.party.ofbiz.controller;

import com.example.erp.party.ofbiz.domain.PartyIdentification;
import com.example.erp.party.ofbiz.service.PartyIdentificationService;
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
@RequestMapping("/ofbiz/party-identifications")
public class PartyIdentificationController {

    private final PartyIdentificationService service;

    public PartyIdentificationController(PartyIdentificationService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyIdentification> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyIdentification get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyIdentification> create(@RequestBody PartyIdentification entity) {
        PartyIdentification created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyIdentification update(@PathVariable Long id, @RequestBody PartyIdentification entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}