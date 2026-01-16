package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.CostComponent;
import com.example.erp.wms.ofbiz.service.CostComponentService;
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
@RequestMapping("/ofbiz/cost-components")
public class CostComponentController {

    private final CostComponentService service;

    public CostComponentController(CostComponentService service) {
        this.service = service;
    }

    @GetMapping
    public List<CostComponent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CostComponent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CostComponent> create(@RequestBody CostComponent entity) {
        CostComponent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CostComponent update(@PathVariable Long id, @RequestBody CostComponent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}