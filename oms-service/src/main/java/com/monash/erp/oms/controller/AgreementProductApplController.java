package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementProductAppl;
import com.monash.erp.oms.service.AgreementProductApplService;
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
@RequestMapping("/api/agreement-product-appls")
public class AgreementProductApplController {

    private final AgreementProductApplService service;

    public AgreementProductApplController(AgreementProductApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementProductAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementProductAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementProductAppl> create(@RequestBody AgreementProductAppl entity) {
        AgreementProductAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementProductAppl update(@PathVariable Long id, @RequestBody AgreementProductAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}