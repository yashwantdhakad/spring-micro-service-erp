package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.WebSitePublishPoint;
import com.example.erp.wms.ofbiz.service.WebSitePublishPointService;
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
@RequestMapping("/ofbiz/web-site-publish-points")
public class WebSitePublishPointController {

    private final WebSitePublishPointService service;

    public WebSitePublishPointController(WebSitePublishPointService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebSitePublishPoint> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebSitePublishPoint get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebSitePublishPoint> create(@RequestBody WebSitePublishPoint entity) {
        WebSitePublishPoint created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebSitePublishPoint update(@PathVariable Long id, @RequestBody WebSitePublishPoint entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}