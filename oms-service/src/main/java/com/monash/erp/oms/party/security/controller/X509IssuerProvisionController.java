package com.monash.erp.oms.party.security.controller;

import com.monash.erp.oms.party.security.entity.X509IssuerProvision;
import com.monash.erp.oms.party.security.service.X509IssuerProvisionService;
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
@RequestMapping("/security/x509-issuer-provisions")
public class X509IssuerProvisionController {

    private final X509IssuerProvisionService service;

    public X509IssuerProvisionController(X509IssuerProvisionService service) {
        this.service = service;
    }

    @GetMapping
    public List<X509IssuerProvision> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public X509IssuerProvision get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<X509IssuerProvision> create(@RequestBody X509IssuerProvision entity) {
        X509IssuerProvision created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public X509IssuerProvision update(@PathVariable Long id, @RequestBody X509IssuerProvision entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
