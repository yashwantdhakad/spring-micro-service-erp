package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.UomConversionDated;
import com.monash.erp.oms.service.UomConversionDatedService;
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
@RequestMapping("/api/uom-conversion-dateds")
public class UomConversionDatedController {

    private final UomConversionDatedService service;

    public UomConversionDatedController(UomConversionDatedService service) {
        this.service = service;
    }

    @GetMapping
    public List<UomConversionDated> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UomConversionDated get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UomConversionDated> create(@RequestBody UomConversionDated entity) {
        UomConversionDated created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UomConversionDated update(@PathVariable Long id, @RequestBody UomConversionDated entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}