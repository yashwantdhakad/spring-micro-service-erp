package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContactListType;
import com.monash.erp.wms.service.ContactListTypeService;
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
@RequestMapping("/api/contact-list-types")
public class ContactListTypeController {

    private final ContactListTypeService service;

    public ContactListTypeController(ContactListTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactListType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactListType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactListType> create(@RequestBody ContactListType entity) {
        ContactListType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactListType update(@PathVariable Long id, @RequestBody ContactListType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}