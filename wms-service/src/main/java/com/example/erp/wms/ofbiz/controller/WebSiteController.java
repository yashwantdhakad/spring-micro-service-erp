package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.WebSite;
import com.example.erp.wms.ofbiz.service.WebSiteService;
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
@RequestMapping("/ofbiz/web-sites")
public class WebSiteController {

    private final WebSiteService service;

    public WebSiteController(WebSiteService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebSite> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebSite get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebSite> create(@RequestBody WebSite entity) {
        WebSite created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebSite update(@PathVariable Long id, @RequestBody WebSite entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}