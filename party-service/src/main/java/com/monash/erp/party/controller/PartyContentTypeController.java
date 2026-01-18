package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyContentType;
import com.monash.erp.party.service.PartyContentTypeService;
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
@RequestMapping("/api/party-content-types")
public class PartyContentTypeController {

    private final PartyContentTypeService service;

    public PartyContentTypeController(PartyContentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyContentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyContentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyContentType> create(@RequestBody PartyContentType entity) {
        PartyContentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyContentType update(@PathVariable Long id, @RequestBody PartyContentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}