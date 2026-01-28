package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyRate;
import com.monash.erp.party.service.PartyRateService;
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
@RequestMapping("/api/party-rates")
public class PartyRateController {

    private final PartyRateService service;

    public PartyRateController(PartyRateService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyRate> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyRate get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyRate> create(@RequestBody PartyRate entity) {
        PartyRate created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyRate update(@PathVariable Long id, @RequestBody PartyRate entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}