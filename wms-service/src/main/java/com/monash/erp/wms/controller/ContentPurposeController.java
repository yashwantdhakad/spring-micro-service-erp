package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContentPurpose;
import com.monash.erp.wms.service.ContentPurposeService;
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
@RequestMapping("/api/content-purposes")
public class ContentPurposeController {

    private final ContentPurposeService service;

    public ContentPurposeController(ContentPurposeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentPurpose> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContentPurpose get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContentPurpose> create(@RequestBody ContentPurpose entity) {
        ContentPurpose created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContentPurpose update(@PathVariable Long id, @RequestBody ContentPurpose entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}