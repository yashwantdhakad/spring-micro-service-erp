package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebslingerHostSuffix;
import com.monash.erp.wms.service.WebslingerHostSuffixService;
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
@RequestMapping("/api/webslinger-host-suffixes")
public class WebslingerHostSuffixController {

    private final WebslingerHostSuffixService service;

    public WebslingerHostSuffixController(WebslingerHostSuffixService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebslingerHostSuffix> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebslingerHostSuffix get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebslingerHostSuffix> create(@RequestBody WebslingerHostSuffix entity) {
        WebslingerHostSuffix created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebslingerHostSuffix update(@PathVariable Long id, @RequestBody WebslingerHostSuffix entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}