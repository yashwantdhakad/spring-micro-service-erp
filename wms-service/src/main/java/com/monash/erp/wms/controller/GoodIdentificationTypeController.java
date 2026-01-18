package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.GoodIdentificationType;
import com.monash.erp.wms.service.GoodIdentificationTypeService;
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
@RequestMapping("/ofbiz/good-identification-types")
public class GoodIdentificationTypeController {

    private final GoodIdentificationTypeService service;

    public GoodIdentificationTypeController(GoodIdentificationTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<GoodIdentificationType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GoodIdentificationType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GoodIdentificationType> create(@RequestBody GoodIdentificationType entity) {
        GoodIdentificationType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GoodIdentificationType update(@PathVariable Long id, @RequestBody GoodIdentificationType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}