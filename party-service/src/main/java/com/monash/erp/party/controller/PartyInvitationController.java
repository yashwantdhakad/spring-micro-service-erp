package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyInvitation;
import com.monash.erp.party.service.PartyInvitationService;
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
@RequestMapping("/api/party-invitations")
public class PartyInvitationController {

    private final PartyInvitationService service;

    public PartyInvitationController(PartyInvitationService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyInvitation> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyInvitation get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyInvitation> create(@RequestBody PartyInvitation entity) {
        PartyInvitation created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyInvitation update(@PathVariable Long id, @RequestBody PartyInvitation entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}