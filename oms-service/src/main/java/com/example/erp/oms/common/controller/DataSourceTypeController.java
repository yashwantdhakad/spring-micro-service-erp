package com.example.erp.oms.common.controller;

import com.example.erp.oms.common.domain.DataSourceType;
import com.example.erp.oms.common.service.DataSourceTypeService;
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
@RequestMapping("/common/data-source-types")
public class DataSourceTypeController {

    private final DataSourceTypeService service;

    public DataSourceTypeController(DataSourceTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<DataSourceType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DataSourceType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DataSourceType> create(@RequestBody DataSourceType entity) {
        DataSourceType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DataSourceType update(@PathVariable Long id, @RequestBody DataSourceType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
