package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementPartyApplic;
import com.monash.erp.oms.service.AgreementPartyApplicService;
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
@RequestMapping("/api/agreement-party-applics")
public class AgreementPartyApplicController {

    private final AgreementPartyApplicService service;

    public AgreementPartyApplicController(AgreementPartyApplicService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementPartyApplic> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementPartyApplic get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementPartyApplic> create(@RequestBody AgreementPartyApplic entity) {
        AgreementPartyApplic created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementPartyApplic update(@PathVariable Long id, @RequestBody AgreementPartyApplic entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}