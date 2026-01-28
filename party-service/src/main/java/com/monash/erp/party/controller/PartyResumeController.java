package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PartyResume;
import com.monash.erp.party.service.PartyResumeService;
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
@RequestMapping("/api/party-resumes")
public class PartyResumeController {

    private final PartyResumeService service;

    public PartyResumeController(PartyResumeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyResume> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyResume get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyResume> create(@RequestBody PartyResume entity) {
        PartyResume created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyResume update(@PathVariable Long id, @RequestBody PartyResume entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}