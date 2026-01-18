package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CostComponentType;
import com.monash.erp.wms.service.CostComponentTypeService;
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
@RequestMapping("/api/cost-component-types")
public class CostComponentTypeController {

    private final CostComponentTypeService service;

    public CostComponentTypeController(CostComponentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CostComponentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CostComponentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CostComponentType> create(@RequestBody CostComponentType entity) {
        CostComponentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CostComponentType update(@PathVariable Long id, @RequestBody CostComponentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}