package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContentPurposeOperation;
import com.monash.erp.wms.service.ContentPurposeOperationService;
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
@RequestMapping("/api/content-purpose-operations")
public class ContentPurposeOperationController {

    private final ContentPurposeOperationService service;

    public ContentPurposeOperationController(ContentPurposeOperationService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentPurposeOperation> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContentPurposeOperation get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContentPurposeOperation> create(@RequestBody ContentPurposeOperation entity) {
        ContentPurposeOperation created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContentPurposeOperation update(@PathVariable Long id, @RequestBody ContentPurposeOperation entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}