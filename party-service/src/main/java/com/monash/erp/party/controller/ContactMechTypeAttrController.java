package com.monash.erp.party.controller;

import com.monash.erp.party.entity.ContactMechTypeAttr;
import com.monash.erp.party.service.ContactMechTypeAttrService;
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
@RequestMapping("/api/contact-mech-type-attrs")
public class ContactMechTypeAttrController {

    private final ContactMechTypeAttrService service;

    public ContactMechTypeAttrController(ContactMechTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactMechTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactMechTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactMechTypeAttr> create(@RequestBody ContactMechTypeAttr entity) {
        ContactMechTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactMechTypeAttr update(@PathVariable Long id, @RequestBody ContactMechTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}