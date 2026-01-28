package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementItemTypeAttr;
import com.monash.erp.oms.service.AgreementItemTypeAttrService;
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
@RequestMapping("/api/agreement-item-type-attrs")
public class AgreementItemTypeAttrController {

    private final AgreementItemTypeAttrService service;

    public AgreementItemTypeAttrController(AgreementItemTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementItemTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementItemTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementItemTypeAttr> create(@RequestBody AgreementItemTypeAttr entity) {
        AgreementItemTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementItemTypeAttr update(@PathVariable Long id, @RequestBody AgreementItemTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}