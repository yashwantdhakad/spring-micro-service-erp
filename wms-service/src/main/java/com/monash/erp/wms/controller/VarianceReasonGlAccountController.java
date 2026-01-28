package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.VarianceReasonGlAccount;
import com.monash.erp.wms.service.VarianceReasonGlAccountService;
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
@RequestMapping("/api/variance-reason-gl-accounts")
public class VarianceReasonGlAccountController {

    private final VarianceReasonGlAccountService service;

    public VarianceReasonGlAccountController(VarianceReasonGlAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<VarianceReasonGlAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public VarianceReasonGlAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<VarianceReasonGlAccount> create(@RequestBody VarianceReasonGlAccount entity) {
        VarianceReasonGlAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public VarianceReasonGlAccount update(@PathVariable Long id, @RequestBody VarianceReasonGlAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}