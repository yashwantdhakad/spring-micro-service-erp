package com.monash.erp.party.controller;

import com.monash.erp.party.entity.ContactMechTypePurpose;
import com.monash.erp.party.service.ContactMechTypePurposeService;
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
@RequestMapping("/ofbiz/contact-mech-type-purposes")
public class ContactMechTypePurposeController {

    private final ContactMechTypePurposeService service;

    public ContactMechTypePurposeController(ContactMechTypePurposeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactMechTypePurpose> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactMechTypePurpose get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactMechTypePurpose> create(@RequestBody ContactMechTypePurpose entity) {
        ContactMechTypePurpose created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactMechTypePurpose update(@PathVariable Long id, @RequestBody ContactMechTypePurpose entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}