package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebAnalyticsType;
import com.monash.erp.wms.service.WebAnalyticsTypeService;
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
@RequestMapping("/ofbiz/web-analytics-types")
public class WebAnalyticsTypeController {

    private final WebAnalyticsTypeService service;

    public WebAnalyticsTypeController(WebAnalyticsTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebAnalyticsType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebAnalyticsType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebAnalyticsType> create(@RequestBody WebAnalyticsType entity) {
        WebAnalyticsType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebAnalyticsType update(@PathVariable Long id, @RequestBody WebAnalyticsType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}