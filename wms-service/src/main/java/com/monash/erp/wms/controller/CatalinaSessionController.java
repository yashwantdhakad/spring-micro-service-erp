package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CatalinaSession;
import com.monash.erp.wms.service.CatalinaSessionService;
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
@RequestMapping("/api/catalina-sessions")
public class CatalinaSessionController {

    private final CatalinaSessionService service;

    public CatalinaSessionController(CatalinaSessionService service) {
        this.service = service;
    }

    @GetMapping
    public List<CatalinaSession> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CatalinaSession get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CatalinaSession> create(@RequestBody CatalinaSession entity) {
        CatalinaSession created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CatalinaSession update(@PathVariable Long id, @RequestBody CatalinaSession entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}