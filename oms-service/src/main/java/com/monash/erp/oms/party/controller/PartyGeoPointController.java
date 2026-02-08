package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyGeoPoint;
import com.monash.erp.oms.party.service.PartyGeoPointService;
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
@RequestMapping("/api/party-geo-points")
public class PartyGeoPointController {

    private final PartyGeoPointService service;

    public PartyGeoPointController(PartyGeoPointService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyGeoPoint> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyGeoPoint get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyGeoPoint> create(@RequestBody PartyGeoPoint entity) {
        PartyGeoPoint created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyGeoPoint update(@PathVariable Long id, @RequestBody PartyGeoPoint entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}