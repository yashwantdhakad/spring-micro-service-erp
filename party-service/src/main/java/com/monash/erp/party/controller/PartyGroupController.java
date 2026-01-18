package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyGroup;
import com.monash.erp.party.service.PartyGroupService;
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
@RequestMapping("/api/party-groups")
public class PartyGroupController {

    private final PartyGroupService service;

    public PartyGroupController(PartyGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyGroup> create(@RequestBody PartyGroup entity) {
        PartyGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyGroup update(@PathVariable Long id, @RequestBody PartyGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}