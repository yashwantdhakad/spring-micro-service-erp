package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PostalAddress;
import com.monash.erp.oms.party.service.PostalAddressService;
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
@RequestMapping("/api/postal-addresses")
public class PostalAddressController {

    private final PostalAddressService service;

    public PostalAddressController(PostalAddressService service) {
        this.service = service;
    }

    @GetMapping
    public List<PostalAddress> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PostalAddress get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/by-contact-mech/{contactMechId}")
    public PostalAddress getByContactMechId(@PathVariable String contactMechId) {
        return service.getByContactMechId(contactMechId);
    }

    @PostMapping
    public ResponseEntity<PostalAddress> create(@RequestBody PostalAddress entity) {
        PostalAddress created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PostalAddress update(@PathVariable Long id, @RequestBody PostalAddress entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
