package com.example.erp.party.ofbiz.controller;

import com.example.erp.party.ofbiz.domain.PartyType;
import com.example.erp.party.ofbiz.service.PartyTypeService;
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
@RequestMapping("/ofbiz/party-types")
public class PartyTypeController {

    private final PartyTypeService service;

    public PartyTypeController(PartyTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyType> create(@RequestBody PartyType entity) {
        PartyType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyType update(@PathVariable Long id, @RequestBody PartyType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}