package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.ContactListParty;
import com.monash.erp.oms.party.service.ContactListPartyService;
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
@RequestMapping("/api/contact-list-parties")
public class ContactListPartyController {

    private final ContactListPartyService service;

    public ContactListPartyController(ContactListPartyService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactListParty> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactListParty get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactListParty> create(@RequestBody ContactListParty entity) {
        ContactListParty created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactListParty update(@PathVariable Long id, @RequestBody ContactListParty entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
