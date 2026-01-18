package com.monash.erp.party.controller;

import com.monash.erp.party.entity.ContactMechPurposeType;
import com.monash.erp.party.service.ContactMechPurposeTypeService;
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
@RequestMapping("/ofbiz/contact-mech-purpose-types")
public class ContactMechPurposeTypeController {

    private final ContactMechPurposeTypeService service;

    public ContactMechPurposeTypeController(ContactMechPurposeTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactMechPurposeType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactMechPurposeType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactMechPurposeType> create(@RequestBody ContactMechPurposeType entity) {
        ContactMechPurposeType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactMechPurposeType update(@PathVariable Long id, @RequestBody ContactMechPurposeType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}