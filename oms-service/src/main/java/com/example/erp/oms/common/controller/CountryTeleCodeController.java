package com.example.erp.oms.common.controller;

import com.example.erp.oms.common.domain.CountryTeleCode;
import com.example.erp.oms.common.service.CountryTeleCodeService;
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
@RequestMapping("/common/country-tele-codes")
public class CountryTeleCodeController {

    private final CountryTeleCodeService service;

    public CountryTeleCodeController(CountryTeleCodeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CountryTeleCode> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CountryTeleCode get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CountryTeleCode> create(@RequestBody CountryTeleCode entity) {
        CountryTeleCode created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CountryTeleCode update(@PathVariable Long id, @RequestBody CountryTeleCode entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
