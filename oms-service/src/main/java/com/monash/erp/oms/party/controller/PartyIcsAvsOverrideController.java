package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyIcsAvsOverride;
import com.monash.erp.oms.party.service.PartyIcsAvsOverrideService;
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
@RequestMapping("/api/party-ics-avs-overrides")
public class PartyIcsAvsOverrideController {

    private final PartyIcsAvsOverrideService service;

    public PartyIcsAvsOverrideController(PartyIcsAvsOverrideService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyIcsAvsOverride> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyIcsAvsOverride get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyIcsAvsOverride> create(@RequestBody PartyIcsAvsOverride entity) {
        PartyIcsAvsOverride created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyIcsAvsOverride update(@PathVariable Long id, @RequestBody PartyIcsAvsOverride entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}