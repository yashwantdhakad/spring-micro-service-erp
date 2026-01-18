package com.monash.erp.party.controller;

import com.monash.erp.party.entity.ContactMechType;
import com.monash.erp.party.service.ContactMechTypeService;
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
@RequestMapping("/api/contact-mech-types")
public class ContactMechTypeController {

    private final ContactMechTypeService service;

    public ContactMechTypeController(ContactMechTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactMechType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactMechType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactMechType> create(@RequestBody ContactMechType entity) {
        ContactMechType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactMechType update(@PathVariable Long id, @RequestBody ContactMechType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}