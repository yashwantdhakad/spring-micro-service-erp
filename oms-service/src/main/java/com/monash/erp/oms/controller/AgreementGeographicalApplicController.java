package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementGeographicalApplic;
import com.monash.erp.oms.service.AgreementGeographicalApplicService;
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
@RequestMapping("/api/agreement-geographical-applics")
public class AgreementGeographicalApplicController {

    private final AgreementGeographicalApplicService service;

    public AgreementGeographicalApplicController(AgreementGeographicalApplicService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementGeographicalApplic> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementGeographicalApplic get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementGeographicalApplic> create(@RequestBody AgreementGeographicalApplic entity) {
        AgreementGeographicalApplic created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementGeographicalApplic update(@PathVariable Long id, @RequestBody AgreementGeographicalApplic entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}