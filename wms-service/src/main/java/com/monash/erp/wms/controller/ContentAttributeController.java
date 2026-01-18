package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContentAttribute;
import com.monash.erp.wms.service.ContentAttributeService;
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
@RequestMapping("/api/content-attributes")
public class ContentAttributeController {

    private final ContentAttributeService service;

    public ContentAttributeController(ContentAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContentAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContentAttribute> create(@RequestBody ContentAttribute entity) {
        ContentAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContentAttribute update(@PathVariable Long id, @RequestBody ContentAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}