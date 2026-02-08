package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyCAGCode;
import com.monash.erp.oms.party.service.PartyCAGCodeService;
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
@RequestMapping("/api/party-cag-codes")
public class PartyCAGCodeController {

    private final PartyCAGCodeService service;

    public PartyCAGCodeController(PartyCAGCodeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyCAGCode> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyCAGCode get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyCAGCode> create(@RequestBody PartyCAGCode entity) {
        PartyCAGCode created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyCAGCode update(@PathVariable Long id, @RequestBody PartyCAGCode entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}