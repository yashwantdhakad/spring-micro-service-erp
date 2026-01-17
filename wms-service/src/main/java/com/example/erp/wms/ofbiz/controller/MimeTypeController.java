package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.MimeType;
import com.example.erp.wms.ofbiz.service.MimeTypeService;
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
@RequestMapping("/ofbiz/mime-types")
public class MimeTypeController {

    private final MimeTypeService service;

    public MimeTypeController(MimeTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<MimeType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MimeType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<MimeType> create(@RequestBody MimeType entity) {
        MimeType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public MimeType update(@PathVariable Long id, @RequestBody MimeType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}