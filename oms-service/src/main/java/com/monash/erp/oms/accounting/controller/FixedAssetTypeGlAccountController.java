package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.FixedAssetTypeGlAccount;
import com.monash.erp.oms.accounting.service.FixedAssetTypeGlAccountService;
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
@RequestMapping("/api/accounting/fixed-asset-type-gl-accounts")
public class FixedAssetTypeGlAccountController {

    private final FixedAssetTypeGlAccountService service;

    public FixedAssetTypeGlAccountController(FixedAssetTypeGlAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<FixedAssetTypeGlAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FixedAssetTypeGlAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FixedAssetTypeGlAccount> create(@RequestBody FixedAssetTypeGlAccount entity) {
        FixedAssetTypeGlAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FixedAssetTypeGlAccount update(@PathVariable Long id, @RequestBody FixedAssetTypeGlAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
