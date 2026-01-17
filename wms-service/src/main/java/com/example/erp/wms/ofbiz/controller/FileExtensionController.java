package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.FileExtension;
import com.example.erp.wms.ofbiz.service.FileExtensionService;
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
@RequestMapping("/ofbiz/file-extensions")
public class FileExtensionController {

    private final FileExtensionService service;

    public FileExtensionController(FileExtensionService service) {
        this.service = service;
    }

    @GetMapping
    public List<FileExtension> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public FileExtension get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<FileExtension> create(@RequestBody FileExtension entity) {
        FileExtension created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public FileExtension update(@PathVariable Long id, @RequestBody FileExtension entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}