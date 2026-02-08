package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyInvitationGroupAssoc;
import com.monash.erp.oms.party.service.PartyInvitationGroupAssocService;
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
@RequestMapping("/api/party-invitation-group-assocs")
public class PartyInvitationGroupAssocController {

    private final PartyInvitationGroupAssocService service;

    public PartyInvitationGroupAssocController(PartyInvitationGroupAssocService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyInvitationGroupAssoc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyInvitationGroupAssoc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyInvitationGroupAssoc> create(@RequestBody PartyInvitationGroupAssoc entity) {
        PartyInvitationGroupAssoc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyInvitationGroupAssoc update(@PathVariable Long id, @RequestBody PartyInvitationGroupAssoc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}