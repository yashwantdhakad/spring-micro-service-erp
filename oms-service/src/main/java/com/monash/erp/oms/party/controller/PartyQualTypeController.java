package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyQualType;
import com.monash.erp.oms.party.service.PartyQualTypeService;
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
@RequestMapping("/api/party-qual-types")
public class PartyQualTypeController {

    private final PartyQualTypeService service;

    public PartyQualTypeController(PartyQualTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyQualType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyQualType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyQualType> create(@RequestBody PartyQualType entity) {
        PartyQualType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyQualType update(@PathVariable Long id, @RequestBody PartyQualType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}