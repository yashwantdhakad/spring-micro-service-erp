package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.CountryAddressFormat;
import com.monash.erp.oms.common.service.CountryAddressFormatService;
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
@RequestMapping("/api/common/country-address-formats")
public class CountryAddressFormatController {

    private final CountryAddressFormatService service;

    public CountryAddressFormatController(CountryAddressFormatService service) {
        this.service = service;
    }

    @GetMapping
    public List<CountryAddressFormat> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CountryAddressFormat get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CountryAddressFormat> create(@RequestBody CountryAddressFormat entity) {
        CountryAddressFormat created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CountryAddressFormat update(@PathVariable Long id, @RequestBody CountryAddressFormat entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
