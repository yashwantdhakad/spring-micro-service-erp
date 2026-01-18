package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyNote;
import com.monash.erp.party.service.PartyNoteService;
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
@RequestMapping("/api/party-notes")
public class PartyNoteController {

    private final PartyNoteService service;

    public PartyNoteController(PartyNoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyNote> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyNote get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyNote> create(@RequestBody PartyNote entity) {
        PartyNote created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyNote update(@PathVariable Long id, @RequestBody PartyNote entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}