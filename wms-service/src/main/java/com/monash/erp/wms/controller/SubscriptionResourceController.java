package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SubscriptionResource;
import com.monash.erp.wms.service.SubscriptionResourceService;
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
@RequestMapping("/api/subscription-resources")
public class SubscriptionResourceController {

    private final SubscriptionResourceService service;

    public SubscriptionResourceController(SubscriptionResourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<SubscriptionResource> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SubscriptionResource get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SubscriptionResource> create(@RequestBody SubscriptionResource entity) {
        SubscriptionResource created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SubscriptionResource update(@PathVariable Long id, @RequestBody SubscriptionResource entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}