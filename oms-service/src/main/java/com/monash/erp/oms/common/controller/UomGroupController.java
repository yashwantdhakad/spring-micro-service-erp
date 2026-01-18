package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.UomGroup;
import com.monash.erp.oms.common.service.UomGroupService;
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
@RequestMapping("/api/common/uom-groups")
public class UomGroupController {

    private final UomGroupService service;

    public UomGroupController(UomGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<UomGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UomGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UomGroup> create(@RequestBody UomGroup entity) {
        UomGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UomGroup update(@PathVariable Long id, @RequestBody UomGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
