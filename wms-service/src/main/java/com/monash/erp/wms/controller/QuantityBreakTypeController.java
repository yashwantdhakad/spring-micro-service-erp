package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.QuantityBreakType;
import com.monash.erp.wms.service.QuantityBreakTypeService;
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
@RequestMapping("/api/quantity-break-types")
public class QuantityBreakTypeController {

    private final QuantityBreakTypeService service;

    public QuantityBreakTypeController(QuantityBreakTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuantityBreakType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public QuantityBreakType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<QuantityBreakType> create(@RequestBody QuantityBreakType entity) {
        QuantityBreakType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public QuantityBreakType update(@PathVariable Long id, @RequestBody QuantityBreakType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}