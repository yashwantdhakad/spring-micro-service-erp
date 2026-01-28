package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementWorkeffortAppl;
import com.monash.erp.oms.service.AgreementWorkeffortApplService;
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
@RequestMapping("/api/agreement-workeffort-appls")
public class AgreementWorkeffortApplController {

    private final AgreementWorkeffortApplService service;

    public AgreementWorkeffortApplController(AgreementWorkeffortApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementWorkeffortAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementWorkeffortAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementWorkeffortAppl> create(@RequestBody AgreementWorkeffortAppl entity) {
        AgreementWorkeffortAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementWorkeffortAppl update(@PathVariable Long id, @RequestBody AgreementWorkeffortAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}