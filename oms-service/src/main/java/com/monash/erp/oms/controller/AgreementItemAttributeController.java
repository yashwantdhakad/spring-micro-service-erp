package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementItemAttribute;
import com.monash.erp.oms.service.AgreementItemAttributeService;
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
@RequestMapping("/api/agreement-item-attributes")
public class AgreementItemAttributeController {

    private final AgreementItemAttributeService service;

    public AgreementItemAttributeController(AgreementItemAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementItemAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementItemAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementItemAttribute> create(@RequestBody AgreementItemAttribute entity) {
        AgreementItemAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementItemAttribute update(@PathVariable Long id, @RequestBody AgreementItemAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}