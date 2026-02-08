package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyNeed;
import com.monash.erp.oms.party.service.PartyNeedService;
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
@RequestMapping("/api/party-needs")
public class PartyNeedController {

    private final PartyNeedService service;

    public PartyNeedController(PartyNeedService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyNeed> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyNeed get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyNeed> create(@RequestBody PartyNeed entity) {
        PartyNeed created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyNeed update(@PathVariable Long id, @RequestBody PartyNeed entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}