package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.MetaDataPredicate;
import com.monash.erp.wms.service.MetaDataPredicateService;
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
@RequestMapping("/api/meta-data-predicates")
public class MetaDataPredicateController {

    private final MetaDataPredicateService service;

    public MetaDataPredicateController(MetaDataPredicateService service) {
        this.service = service;
    }

    @GetMapping
    public List<MetaDataPredicate> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MetaDataPredicate get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<MetaDataPredicate> create(@RequestBody MetaDataPredicate entity) {
        MetaDataPredicate created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public MetaDataPredicate update(@PathVariable Long id, @RequestBody MetaDataPredicate entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}