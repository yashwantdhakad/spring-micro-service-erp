package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.StandardLanguage;
import com.monash.erp.oms.service.StandardLanguageService;
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
@RequestMapping("/api/standard-languages")
public class StandardLanguageController {

    private final StandardLanguageService service;

    public StandardLanguageController(StandardLanguageService service) {
        this.service = service;
    }

    @GetMapping
    public List<StandardLanguage> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public StandardLanguage get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<StandardLanguage> create(@RequestBody StandardLanguage entity) {
        StandardLanguage created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public StandardLanguage update(@PathVariable Long id, @RequestBody StandardLanguage entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}