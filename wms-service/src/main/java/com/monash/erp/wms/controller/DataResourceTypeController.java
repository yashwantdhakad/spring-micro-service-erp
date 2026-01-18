package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DataResourceType;
import com.monash.erp.wms.service.DataResourceTypeService;
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
@RequestMapping("/ofbiz/data-resource-types")
public class DataResourceTypeController {

    private final DataResourceTypeService service;

    public DataResourceTypeController(DataResourceTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<DataResourceType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DataResourceType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DataResourceType> create(@RequestBody DataResourceType entity) {
        DataResourceType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DataResourceType update(@PathVariable Long id, @RequestBody DataResourceType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}