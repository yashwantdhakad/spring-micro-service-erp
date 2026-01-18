package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.VisualTheme;
import com.monash.erp.oms.common.service.VisualThemeService;
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
@RequestMapping("/common/visual-themes")
public class VisualThemeController {

    private final VisualThemeService service;

    public VisualThemeController(VisualThemeService service) {
        this.service = service;
    }

    @GetMapping
    public List<VisualTheme> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public VisualTheme get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<VisualTheme> create(@RequestBody VisualTheme entity) {
        VisualTheme created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public VisualTheme update(@PathVariable Long id, @RequestBody VisualTheme entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
