package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContactListCommStatus;
import com.monash.erp.wms.service.ContactListCommStatusService;
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
@RequestMapping("/api/contact-list-comm-statuses")
public class ContactListCommStatusController {

    private final ContactListCommStatusService service;

    public ContactListCommStatusController(ContactListCommStatusService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactListCommStatus> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContactListCommStatus get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContactListCommStatus> create(@RequestBody ContactListCommStatus entity) {
        ContactListCommStatus created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContactListCommStatus update(@PathVariable Long id, @RequestBody ContactListCommStatus entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}