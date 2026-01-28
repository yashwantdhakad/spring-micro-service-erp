package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ZipSalesRuleLookup;
import com.monash.erp.wms.service.ZipSalesRuleLookupService;
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
@RequestMapping("/api/zip-sales-rule-lookups")
public class ZipSalesRuleLookupController {

    private final ZipSalesRuleLookupService service;

    public ZipSalesRuleLookupController(ZipSalesRuleLookupService service) {
        this.service = service;
    }

    @GetMapping
    public List<ZipSalesRuleLookup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ZipSalesRuleLookup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ZipSalesRuleLookup> create(@RequestBody ZipSalesRuleLookup entity) {
        ZipSalesRuleLookup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ZipSalesRuleLookup update(@PathVariable Long id, @RequestBody ZipSalesRuleLookup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}