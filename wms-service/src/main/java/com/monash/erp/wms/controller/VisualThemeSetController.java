package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.VisualThemeSet;
import com.monash.erp.wms.service.VisualThemeSetService;
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
@RequestMapping("/api/visual-theme-sets")
public class VisualThemeSetController {

    private final VisualThemeSetService service;

    public VisualThemeSetController(VisualThemeSetService service) {
        this.service = service;
    }

    @GetMapping
    public List<VisualThemeSet> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public VisualThemeSet get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<VisualThemeSet> create(@RequestBody VisualThemeSet entity) {
        VisualThemeSet created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public VisualThemeSet update(@PathVariable Long id, @RequestBody VisualThemeSet entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}