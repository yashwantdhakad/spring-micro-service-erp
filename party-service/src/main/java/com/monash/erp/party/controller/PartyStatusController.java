package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyStatus;
import com.monash.erp.party.service.PartyStatusService;
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
@RequestMapping("/ofbiz/party-statuses")
public class PartyStatusController {

    private final PartyStatusService service;

    public PartyStatusController(PartyStatusService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyStatus> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyStatus get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyStatus> create(@RequestBody PartyStatus entity) {
        PartyStatus created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyStatus update(@PathVariable Long id, @RequestBody PartyStatus entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}