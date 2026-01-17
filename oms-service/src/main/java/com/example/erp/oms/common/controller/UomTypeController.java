package com.example.erp.oms.common.controller;

import com.example.erp.oms.common.domain.UomType;
import com.example.erp.oms.common.service.UomTypeService;
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
@RequestMapping("/common/uom-types")
public class UomTypeController {

    private final UomTypeService service;

    public UomTypeController(UomTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<UomType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UomType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UomType> create(@RequestBody UomType entity) {
        UomType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UomType update(@PathVariable Long id, @RequestBody UomType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
