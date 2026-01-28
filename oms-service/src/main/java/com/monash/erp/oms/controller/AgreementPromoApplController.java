package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementPromoAppl;
import com.monash.erp.oms.service.AgreementPromoApplService;
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
@RequestMapping("/api/agreement-promo-appls")
public class AgreementPromoApplController {

    private final AgreementPromoApplService service;

    public AgreementPromoApplController(AgreementPromoApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementPromoAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementPromoAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementPromoAppl> create(@RequestBody AgreementPromoAppl entity) {
        AgreementPromoAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementPromoAppl update(@PathVariable Long id, @RequestBody AgreementPromoAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}