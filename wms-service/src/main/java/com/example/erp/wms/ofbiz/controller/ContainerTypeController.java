package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ContainerType;
import com.example.erp.wms.ofbiz.service.ContainerTypeService;
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
@RequestMapping("/ofbiz/container-types")
public class ContainerTypeController {

    private final ContainerTypeService service;

    public ContainerTypeController(ContainerTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContainerType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContainerType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContainerType> create(@RequestBody ContainerType entity) {
        ContainerType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContainerType update(@PathVariable Long id, @RequestBody ContainerType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}