package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProdConfItemContentType;
import com.monash.erp.wms.service.ProdConfItemContentTypeService;
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
@RequestMapping("/api/prod-conf-item-content-types")
public class ProdConfItemContentTypeController {

    private final ProdConfItemContentTypeService service;

    public ProdConfItemContentTypeController(ProdConfItemContentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProdConfItemContentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProdConfItemContentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProdConfItemContentType> create(@RequestBody ProdConfItemContentType entity) {
        ProdConfItemContentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProdConfItemContentType update(@PathVariable Long id, @RequestBody ProdConfItemContentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}