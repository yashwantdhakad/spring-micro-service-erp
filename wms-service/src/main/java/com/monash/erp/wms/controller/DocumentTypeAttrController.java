package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DocumentTypeAttr;
import com.monash.erp.wms.service.DocumentTypeAttrService;
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
@RequestMapping("/ofbiz/document-type-attrs")
public class DocumentTypeAttrController {

    private final DocumentTypeAttrService service;

    public DocumentTypeAttrController(DocumentTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<DocumentTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DocumentTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DocumentTypeAttr> create(@RequestBody DocumentTypeAttr entity) {
        DocumentTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DocumentTypeAttr update(@PathVariable Long id, @RequestBody DocumentTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}