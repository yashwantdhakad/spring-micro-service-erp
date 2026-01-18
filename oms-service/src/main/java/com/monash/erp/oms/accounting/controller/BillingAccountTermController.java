package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.BillingAccountTerm;
import com.monash.erp.oms.accounting.service.BillingAccountTermService;
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
@RequestMapping("/accounting/billing-account-terms")
public class BillingAccountTermController {

    private final BillingAccountTermService service;

    public BillingAccountTermController(BillingAccountTermService service) {
        this.service = service;
    }

    @GetMapping
    public List<BillingAccountTerm> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BillingAccountTerm get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BillingAccountTerm> create(@RequestBody BillingAccountTerm entity) {
        BillingAccountTerm created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BillingAccountTerm update(@PathVariable Long id, @RequestBody BillingAccountTerm entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
