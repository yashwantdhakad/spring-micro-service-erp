package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.RuntimeData;
import com.monash.erp.wms.service.RuntimeDataService;
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
@RequestMapping("/api/runtime-datas")
public class RuntimeDataController {

    private final RuntimeDataService service;

    public RuntimeDataController(RuntimeDataService service) {
        this.service = service;
    }

    @GetMapping
    public List<RuntimeData> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RuntimeData get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RuntimeData> create(@RequestBody RuntimeData entity) {
        RuntimeData created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RuntimeData update(@PathVariable Long id, @RequestBody RuntimeData entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}