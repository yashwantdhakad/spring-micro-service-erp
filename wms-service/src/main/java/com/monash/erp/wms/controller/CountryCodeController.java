package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CountryCode;
import com.monash.erp.wms.service.CountryCodeService;
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
@RequestMapping("/api/country-codes")
public class CountryCodeController {

    private final CountryCodeService service;

    public CountryCodeController(CountryCodeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CountryCode> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CountryCode get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CountryCode> create(@RequestBody CountryCode entity) {
        CountryCode created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CountryCode update(@PathVariable Long id, @RequestBody CountryCode entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}