package com.example.erp.party.ofbiz.controller;

import com.example.erp.party.ofbiz.domain.PartyClassificationType;
import com.example.erp.party.ofbiz.service.PartyClassificationTypeService;
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
@RequestMapping("/ofbiz/party-classification-types")
public class PartyClassificationTypeController {

    private final PartyClassificationTypeService service;

    public PartyClassificationTypeController(PartyClassificationTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyClassificationType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyClassificationType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyClassificationType> create(@RequestBody PartyClassificationType entity) {
        PartyClassificationType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyClassificationType update(@PathVariable Long id, @RequestBody PartyClassificationType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}