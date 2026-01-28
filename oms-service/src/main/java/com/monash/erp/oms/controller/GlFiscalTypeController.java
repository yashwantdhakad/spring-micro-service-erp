package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.GlFiscalType;
import com.monash.erp.oms.service.GlFiscalTypeService;
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
@RequestMapping("/api/gl-fiscal-types")
public class GlFiscalTypeController {

    private final GlFiscalTypeService service;

    public GlFiscalTypeController(GlFiscalTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlFiscalType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlFiscalType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlFiscalType> create(@RequestBody GlFiscalType entity) {
        GlFiscalType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlFiscalType update(@PathVariable Long id, @RequestBody GlFiscalType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}