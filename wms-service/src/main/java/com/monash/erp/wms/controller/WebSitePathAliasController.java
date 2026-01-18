package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebSitePathAlias;
import com.monash.erp.wms.service.WebSitePathAliasService;
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
@RequestMapping("/api/web-site-path-aliases")
public class WebSitePathAliasController {

    private final WebSitePathAliasService service;

    public WebSitePathAliasController(WebSitePathAliasService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebSitePathAlias> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebSitePathAlias get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebSitePathAlias> create(@RequestBody WebSitePathAlias entity) {
        WebSitePathAlias created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebSitePathAlias update(@PathVariable Long id, @RequestBody WebSitePathAlias entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}