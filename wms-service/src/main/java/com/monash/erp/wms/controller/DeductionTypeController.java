package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DeductionType;
import com.monash.erp.wms.service.DeductionTypeService;
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
@RequestMapping("/api/deduction-types")
public class DeductionTypeController {

    private final DeductionTypeService service;

    public DeductionTypeController(DeductionTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<DeductionType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DeductionType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DeductionType> create(@RequestBody DeductionType entity) {
        DeductionType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DeductionType update(@PathVariable Long id, @RequestBody DeductionType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}