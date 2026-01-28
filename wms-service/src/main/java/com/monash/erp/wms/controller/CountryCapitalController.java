package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CountryCapital;
import com.monash.erp.wms.service.CountryCapitalService;
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
@RequestMapping("/api/country-capitals")
public class CountryCapitalController {

    private final CountryCapitalService service;

    public CountryCapitalController(CountryCapitalService service) {
        this.service = service;
    }

    @GetMapping
    public List<CountryCapital> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CountryCapital get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CountryCapital> create(@RequestBody CountryCapital entity) {
        CountryCapital created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CountryCapital update(@PathVariable Long id, @RequestBody CountryCapital entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}