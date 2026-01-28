package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.UnemploymentClaim;
import com.monash.erp.wms.service.UnemploymentClaimService;
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
@RequestMapping("/api/unemployment-claims")
public class UnemploymentClaimController {

    private final UnemploymentClaimService service;

    public UnemploymentClaimController(UnemploymentClaimService service) {
        this.service = service;
    }

    @GetMapping
    public List<UnemploymentClaim> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UnemploymentClaim get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UnemploymentClaim> create(@RequestBody UnemploymentClaim entity) {
        UnemploymentClaim created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UnemploymentClaim update(@PathVariable Long id, @RequestBody UnemploymentClaim entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}