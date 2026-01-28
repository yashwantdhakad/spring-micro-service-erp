package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementAttribute;
import com.monash.erp.oms.service.AgreementAttributeService;
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
@RequestMapping("/api/agreement-attributes")
public class AgreementAttributeController {

    private final AgreementAttributeService service;

    public AgreementAttributeController(AgreementAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementAttribute> create(@RequestBody AgreementAttribute entity) {
        AgreementAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementAttribute update(@PathVariable Long id, @RequestBody AgreementAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}