package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.GlAccountGroupType;
import com.monash.erp.oms.accounting.service.GlAccountGroupTypeService;
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
@RequestMapping("/accounting/gl-account-group-types")
public class GlAccountGroupTypeController {

    private final GlAccountGroupTypeService service;

    public GlAccountGroupTypeController(GlAccountGroupTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlAccountGroupType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlAccountGroupType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlAccountGroupType> create(@RequestBody GlAccountGroupType entity) {
        GlAccountGroupType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlAccountGroupType update(@PathVariable Long id, @RequestBody GlAccountGroupType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
