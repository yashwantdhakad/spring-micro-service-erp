package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ReturnItem;
import com.monash.erp.wms.service.ReturnItemService;
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
@RequestMapping("/api/return-items")
public class ReturnItemController {

    private final ReturnItemService service;

    public ReturnItemController(ReturnItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReturnItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReturnItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ReturnItem> create(@RequestBody ReturnItem entity) {
        ReturnItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ReturnItem update(@PathVariable Long id, @RequestBody ReturnItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}