package com.example.erp.oms.common.controller;

import com.example.erp.oms.common.domain.Uom;
import com.example.erp.oms.common.service.UomService;
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
@RequestMapping("/common/uoms")
public class UomController {

    private final UomService service;

    public UomController(UomService service) {
        this.service = service;
    }

    @GetMapping
    public List<Uom> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Uom get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<Uom> create(@RequestBody Uom entity) {
        Uom created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Uom update(@PathVariable Long id, @RequestBody Uom entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
