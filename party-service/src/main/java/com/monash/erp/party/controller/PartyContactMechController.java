package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyContactMech;
import com.monash.erp.party.service.PartyContactMechService;
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
@RequestMapping("/ofbiz/party-contact-mechs")
public class PartyContactMechController {

    private final PartyContactMechService service;

    public PartyContactMechController(PartyContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyContactMech> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyContactMech> create(@RequestBody PartyContactMech entity) {
        PartyContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyContactMech update(@PathVariable Long id, @RequestBody PartyContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}