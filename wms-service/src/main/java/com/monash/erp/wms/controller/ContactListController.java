package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContactList;
import com.monash.erp.wms.service.ContactListService;
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
@RequestMapping("/api/contact-lists")
public class ContactListController {

    private final ContactListService service;

    public ContactListController(ContactListService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactList> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactList get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactList> create(@RequestBody ContactList entity) {
        ContactList created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactList update(@PathVariable Long id, @RequestBody ContactList entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}