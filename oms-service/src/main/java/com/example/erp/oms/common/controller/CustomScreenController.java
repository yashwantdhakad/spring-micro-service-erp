package com.example.erp.oms.common.controller;

import com.example.erp.oms.common.domain.CustomScreen;
import com.example.erp.oms.common.service.CustomScreenService;
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
@RequestMapping("/common/custom-screens")
public class CustomScreenController {

    private final CustomScreenService service;

    public CustomScreenController(CustomScreenService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomScreen> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustomScreen get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustomScreen> create(@RequestBody CustomScreen entity) {
        CustomScreen created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustomScreen update(@PathVariable Long id, @RequestBody CustomScreen entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
