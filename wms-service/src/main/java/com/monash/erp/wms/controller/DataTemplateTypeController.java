package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.DataTemplateType;
import com.monash.erp.wms.service.DataTemplateTypeService;
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
@RequestMapping("/ofbiz/data-template-types")
public class DataTemplateTypeController {

    private final DataTemplateTypeService service;

    public DataTemplateTypeController(DataTemplateTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<DataTemplateType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DataTemplateType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DataTemplateType> create(@RequestBody DataTemplateType entity) {
        DataTemplateType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DataTemplateType update(@PathVariable Long id, @RequestBody DataTemplateType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}