package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyRateNew;
import com.monash.erp.oms.party.service.PartyRateNewService;
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
@RequestMapping("/api/party-rate-news")
public class PartyRateNewController {

    private final PartyRateNewService service;

    public PartyRateNewController(PartyRateNewService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyRateNew> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyRateNew get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyRateNew> create(@RequestBody PartyRateNew entity) {
        PartyRateNew created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyRateNew update(@PathVariable Long id, @RequestBody PartyRateNew entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}