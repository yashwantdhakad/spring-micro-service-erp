package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyNameHistory;
import com.monash.erp.party.service.PartyNameHistoryService;
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
@RequestMapping("/api/party-name-histories")
public class PartyNameHistoryController {

    private final PartyNameHistoryService service;

    public PartyNameHistoryController(PartyNameHistoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyNameHistory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyNameHistory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyNameHistory> create(@RequestBody PartyNameHistory entity) {
        PartyNameHistory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyNameHistory update(@PathVariable Long id, @RequestBody PartyNameHistory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
