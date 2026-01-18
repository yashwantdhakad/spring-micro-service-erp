package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebUserPreference;
import com.monash.erp.wms.service.WebUserPreferenceService;
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
@RequestMapping("/ofbiz/web-user-preferences")
public class WebUserPreferenceController {

    private final WebUserPreferenceService service;

    public WebUserPreferenceController(WebUserPreferenceService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebUserPreference> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebUserPreference get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebUserPreference> create(@RequestBody WebUserPreference entity) {
        WebUserPreference created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebUserPreference update(@PathVariable Long id, @RequestBody WebUserPreference entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}