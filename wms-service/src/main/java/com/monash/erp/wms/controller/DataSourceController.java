package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DataSource;
import com.monash.erp.wms.service.DataSourceService;
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
@RequestMapping("/api/data-sources")
public class DataSourceController {

    private final DataSourceService service;

    public DataSourceController(DataSourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<DataSource> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DataSource get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DataSource> create(@RequestBody DataSource entity) {
        DataSource created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DataSource update(@PathVariable Long id, @RequestBody DataSource entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}