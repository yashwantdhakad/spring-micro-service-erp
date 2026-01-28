package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyInvitationRoleAssoc;
import com.monash.erp.party.service.PartyInvitationRoleAssocService;
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
@RequestMapping("/api/party-invitation-role-assocs")
public class PartyInvitationRoleAssocController {

    private final PartyInvitationRoleAssocService service;

    public PartyInvitationRoleAssocController(PartyInvitationRoleAssocService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyInvitationRoleAssoc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyInvitationRoleAssoc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyInvitationRoleAssoc> create(@RequestBody PartyInvitationRoleAssoc entity) {
        PartyInvitationRoleAssoc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyInvitationRoleAssoc update(@PathVariable Long id, @RequestBody PartyInvitationRoleAssoc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}