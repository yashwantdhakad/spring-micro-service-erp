package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebSiteRole;
import com.monash.erp.wms.service.WebSiteRoleService;
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
@RequestMapping("/api/web-site-roles")
public class WebSiteRoleController {

    private final WebSiteRoleService service;

    public WebSiteRoleController(WebSiteRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebSiteRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebSiteRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebSiteRole> create(@RequestBody WebSiteRole entity) {
        WebSiteRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebSiteRole update(@PathVariable Long id, @RequestBody WebSiteRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}