package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ChemicalComponent;
import com.monash.erp.wms.service.ChemicalComponentService;
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
@RequestMapping("/api/chemical-components")
public class ChemicalComponentController {

    private final ChemicalComponentService service;

    public ChemicalComponentController(ChemicalComponentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChemicalComponent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ChemicalComponent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ChemicalComponent> create(@RequestBody ChemicalComponent entity) {
        ChemicalComponent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ChemicalComponent update(@PathVariable Long id, @RequestBody ChemicalComponent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}