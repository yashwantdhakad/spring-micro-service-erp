package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.RequirementTypeAttr;
import com.monash.erp.wms.service.RequirementTypeAttrService;
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
@RequestMapping("/api/requirement-type-attrs")
public class RequirementTypeAttrController {

    private final RequirementTypeAttrService service;

    public RequirementTypeAttrController(RequirementTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<RequirementTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RequirementTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RequirementTypeAttr> create(@RequestBody RequirementTypeAttr entity) {
        RequirementTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RequirementTypeAttr update(@PathVariable Long id, @RequestBody RequirementTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}