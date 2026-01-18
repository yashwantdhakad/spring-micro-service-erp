package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyRelationshipType;
import com.monash.erp.party.service.PartyRelationshipTypeService;
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
@RequestMapping("/ofbiz/party-relationship-types")
public class PartyRelationshipTypeController {

    private final PartyRelationshipTypeService service;

    public PartyRelationshipTypeController(PartyRelationshipTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyRelationshipType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyRelationshipType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyRelationshipType> create(@RequestBody PartyRelationshipType entity) {
        PartyRelationshipType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyRelationshipType update(@PathVariable Long id, @RequestBody PartyRelationshipType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}