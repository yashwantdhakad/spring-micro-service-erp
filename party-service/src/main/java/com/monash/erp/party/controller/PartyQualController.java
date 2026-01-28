package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyQual;
import com.monash.erp.party.service.PartyQualService;
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
@RequestMapping("/api/party-quals")
public class PartyQualController {

    private final PartyQualService service;

    public PartyQualController(PartyQualService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyQual> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyQual get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyQual> create(@RequestBody PartyQual entity) {
        PartyQual created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyQual update(@PathVariable Long id, @RequestBody PartyQual entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}