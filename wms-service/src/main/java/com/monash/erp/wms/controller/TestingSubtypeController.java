package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.TestingSubtype;
import com.monash.erp.wms.service.TestingSubtypeService;
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
@RequestMapping("/api/testing-subtypes")
public class TestingSubtypeController {

    private final TestingSubtypeService service;

    public TestingSubtypeController(TestingSubtypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<TestingSubtype> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TestingSubtype get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TestingSubtype> create(@RequestBody TestingSubtype entity) {
        TestingSubtype created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TestingSubtype update(@PathVariable Long id, @RequestBody TestingSubtype entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}