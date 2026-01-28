package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.TestFieldType;
import com.monash.erp.wms.service.TestFieldTypeService;
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
@RequestMapping("/api/test-field-types")
public class TestFieldTypeController {

    private final TestFieldTypeService service;

    public TestFieldTypeController(TestFieldTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<TestFieldType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TestFieldType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TestFieldType> create(@RequestBody TestFieldType entity) {
        TestFieldType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TestFieldType update(@PathVariable Long id, @RequestBody TestFieldType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}