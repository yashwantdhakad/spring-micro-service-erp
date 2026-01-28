package com.monash.erp.party.controller;

import com.monash.erp.party.entity.EmploymentAppSourceType;
import com.monash.erp.party.service.EmploymentAppSourceTypeService;
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
@RequestMapping("/api/employment-app-source-types")
public class EmploymentAppSourceTypeController {

    private final EmploymentAppSourceTypeService service;

    public EmploymentAppSourceTypeController(EmploymentAppSourceTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmploymentAppSourceType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EmploymentAppSourceType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EmploymentAppSourceType> create(@RequestBody EmploymentAppSourceType entity) {
        EmploymentAppSourceType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EmploymentAppSourceType update(@PathVariable Long id, @RequestBody EmploymentAppSourceType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}