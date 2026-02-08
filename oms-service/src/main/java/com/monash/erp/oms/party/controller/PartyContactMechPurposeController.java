package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyContactMechPurpose;
import com.monash.erp.oms.party.service.PartyContactMechPurposeService;
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
@RequestMapping("/api/party-contact-mech-purposes")
public class PartyContactMechPurposeController {

    private final PartyContactMechPurposeService service;

    public PartyContactMechPurposeController(PartyContactMechPurposeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyContactMechPurpose> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyContactMechPurpose get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyContactMechPurpose> create(@RequestBody PartyContactMechPurpose entity) {
        PartyContactMechPurpose created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyContactMechPurpose update(@PathVariable Long id, @RequestBody PartyContactMechPurpose entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}