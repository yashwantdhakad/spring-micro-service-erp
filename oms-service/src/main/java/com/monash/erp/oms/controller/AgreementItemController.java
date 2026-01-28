package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.AgreementItem;
import com.monash.erp.oms.service.AgreementItemService;
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
@RequestMapping("/api/agreement-items")
public class AgreementItemController {

    private final AgreementItemService service;

    public AgreementItemController(AgreementItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgreementItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AgreementItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AgreementItem> create(@RequestBody AgreementItem entity) {
        AgreementItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AgreementItem update(@PathVariable Long id, @RequestBody AgreementItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}