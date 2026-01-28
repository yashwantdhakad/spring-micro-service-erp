package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CustomMethodType;
import com.monash.erp.wms.service.CustomMethodTypeService;
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
@RequestMapping("/api/custom-method-types")
public class CustomMethodTypeController {

    private final CustomMethodTypeService service;

    public CustomMethodTypeController(CustomMethodTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomMethodType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustomMethodType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustomMethodType> create(@RequestBody CustomMethodType entity) {
        CustomMethodType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustomMethodType update(@PathVariable Long id, @RequestBody CustomMethodType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}