package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.GoogleCoShippingMethod;
import com.monash.erp.wms.service.GoogleCoShippingMethodService;
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
@RequestMapping("/api/google-co-shipping-methods")
public class GoogleCoShippingMethodController {

    private final GoogleCoShippingMethodService service;

    public GoogleCoShippingMethodController(GoogleCoShippingMethodService service) {
        this.service = service;
    }

    @GetMapping
    public List<GoogleCoShippingMethod> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GoogleCoShippingMethod get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GoogleCoShippingMethod> create(@RequestBody GoogleCoShippingMethod entity) {
        GoogleCoShippingMethod created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GoogleCoShippingMethod update(@PathVariable Long id, @RequestBody GoogleCoShippingMethod entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}