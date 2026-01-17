package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.CharacterSet;
import com.example.erp.wms.ofbiz.service.CharacterSetService;
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
@RequestMapping("/ofbiz/character-sets")
public class CharacterSetController {

    private final CharacterSetService service;

    public CharacterSetController(CharacterSetService service) {
        this.service = service;
    }

    @GetMapping
    public List<CharacterSet> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CharacterSet get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CharacterSet> create(@RequestBody CharacterSet entity) {
        CharacterSet created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CharacterSet update(@PathVariable Long id, @RequestBody CharacterSet entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}