package com.example.erp.party.ofbiz.controller;

import com.example.erp.party.ofbiz.domain.ContactMech;
import com.example.erp.party.ofbiz.service.ContactMechService;
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
@RequestMapping("/ofbiz/contact-mechs")
public class ContactMechController {

    private final ContactMechService service;

    public ContactMechController(ContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactMech> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactMech> create(@RequestBody ContactMech entity) {
        ContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactMech update(@PathVariable Long id, @RequestBody ContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}