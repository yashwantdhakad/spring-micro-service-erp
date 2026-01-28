package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DefaultProductQual;
import com.monash.erp.wms.service.DefaultProductQualService;
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
@RequestMapping("/api/default-product-quals")
public class DefaultProductQualController {

    private final DefaultProductQualService service;

    public DefaultProductQualController(DefaultProductQualService service) {
        this.service = service;
    }

    @GetMapping
    public List<DefaultProductQual> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DefaultProductQual get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DefaultProductQual> create(@RequestBody DefaultProductQual entity) {
        DefaultProductQual created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DefaultProductQual update(@PathVariable Long id, @RequestBody DefaultProductQual entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}