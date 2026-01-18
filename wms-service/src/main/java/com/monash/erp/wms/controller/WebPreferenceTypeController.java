package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebPreferenceType;
import com.monash.erp.wms.service.WebPreferenceTypeService;
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
@RequestMapping("/api/web-preference-types")
public class WebPreferenceTypeController {

    private final WebPreferenceTypeService service;

    public WebPreferenceTypeController(WebPreferenceTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebPreferenceType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebPreferenceType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebPreferenceType> create(@RequestBody WebPreferenceType entity) {
        WebPreferenceType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebPreferenceType update(@PathVariable Long id, @RequestBody WebPreferenceType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}