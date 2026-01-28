package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebPage;
import com.monash.erp.wms.service.WebPageService;
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
@RequestMapping("/api/web-pages")
public class WebPageController {

    private final WebPageService service;

    public WebPageController(WebPageService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebPage> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebPage get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebPage> create(@RequestBody WebPage entity) {
        WebPage created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebPage update(@PathVariable Long id, @RequestBody WebPage entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}