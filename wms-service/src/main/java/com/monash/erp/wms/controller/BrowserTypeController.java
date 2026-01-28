package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.BrowserType;
import com.monash.erp.wms.service.BrowserTypeService;
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
@RequestMapping("/api/browser-types")
public class BrowserTypeController {

    private final BrowserTypeService service;

    public BrowserTypeController(BrowserTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<BrowserType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BrowserType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BrowserType> create(@RequestBody BrowserType entity) {
        BrowserType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BrowserType update(@PathVariable Long id, @RequestBody BrowserType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}