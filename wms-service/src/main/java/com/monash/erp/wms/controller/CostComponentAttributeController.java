package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CostComponentAttribute;
import com.monash.erp.wms.service.CostComponentAttributeService;
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
@RequestMapping("/api/cost-component-attributes")
public class CostComponentAttributeController {

    private final CostComponentAttributeService service;

    public CostComponentAttributeController(CostComponentAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CostComponentAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CostComponentAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CostComponentAttribute> create(@RequestBody CostComponentAttribute entity) {
        CostComponentAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CostComponentAttribute update(@PathVariable Long id, @RequestBody CostComponentAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}