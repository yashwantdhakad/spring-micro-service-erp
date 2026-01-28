package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SubscriptionTypeAttr;
import com.monash.erp.wms.service.SubscriptionTypeAttrService;
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
@RequestMapping("/api/subscription-type-attrs")
public class SubscriptionTypeAttrController {

    private final SubscriptionTypeAttrService service;

    public SubscriptionTypeAttrController(SubscriptionTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<SubscriptionTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SubscriptionTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SubscriptionTypeAttr> create(@RequestBody SubscriptionTypeAttr entity) {
        SubscriptionTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SubscriptionTypeAttr update(@PathVariable Long id, @RequestBody SubscriptionTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}