package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyDataSource;
import com.monash.erp.party.service.PartyDataSourceService;
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
@RequestMapping("/api/party-data-sources")
public class PartyDataSourceController {

    private final PartyDataSourceService service;

    public PartyDataSourceController(PartyDataSourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyDataSource> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyDataSource get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyDataSource> create(@RequestBody PartyDataSource entity) {
        PartyDataSource created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyDataSource update(@PathVariable Long id, @RequestBody PartyDataSource entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}