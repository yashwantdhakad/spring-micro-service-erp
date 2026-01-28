package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebslingerHostMapping;
import com.monash.erp.wms.service.WebslingerHostMappingService;
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
@RequestMapping("/api/webslinger-host-mappings")
public class WebslingerHostMappingController {

    private final WebslingerHostMappingService service;

    public WebslingerHostMappingController(WebslingerHostMappingService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebslingerHostMapping> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebslingerHostMapping get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebslingerHostMapping> create(@RequestBody WebslingerHostMapping entity) {
        WebslingerHostMapping created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebslingerHostMapping update(@PathVariable Long id, @RequestBody WebslingerHostMapping entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}