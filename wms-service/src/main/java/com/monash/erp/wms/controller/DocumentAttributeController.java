package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DocumentAttribute;
import com.monash.erp.wms.service.DocumentAttributeService;
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
@RequestMapping("/ofbiz/document-attributes")
public class DocumentAttributeController {

    private final DocumentAttributeService service;

    public DocumentAttributeController(DocumentAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<DocumentAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DocumentAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DocumentAttribute> create(@RequestBody DocumentAttribute entity) {
        DocumentAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DocumentAttribute update(@PathVariable Long id, @RequestBody DocumentAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}