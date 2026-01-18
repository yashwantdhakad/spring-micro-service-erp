package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.CustomMethod;
import com.monash.erp.oms.common.service.CustomMethodService;
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
@RequestMapping("/api/common/custom-methods")
public class CustomMethodController {

    private final CustomMethodService service;

    public CustomMethodController(CustomMethodService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomMethod> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustomMethod get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustomMethod> create(@RequestBody CustomMethod entity) {
        CustomMethod created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustomMethod update(@PathVariable Long id, @RequestBody CustomMethod entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
