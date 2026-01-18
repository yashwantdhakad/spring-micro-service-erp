package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebSiteContent;
import com.monash.erp.wms.service.WebSiteContentService;
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
@RequestMapping("/api/web-site-contents")
public class WebSiteContentController {

    private final WebSiteContentService service;

    public WebSiteContentController(WebSiteContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebSiteContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebSiteContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebSiteContent> create(@RequestBody WebSiteContent entity) {
        WebSiteContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebSiteContent update(@PathVariable Long id, @RequestBody WebSiteContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}