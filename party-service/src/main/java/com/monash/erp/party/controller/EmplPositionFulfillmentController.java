package com.monash.erp.party.controller;

import com.monash.erp.party.entity.EmplPositionFulfillment;
import com.monash.erp.party.service.EmplPositionFulfillmentService;
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
@RequestMapping("/api/empl-position-fulfillments")
public class EmplPositionFulfillmentController {

    private final EmplPositionFulfillmentService service;

    public EmplPositionFulfillmentController(EmplPositionFulfillmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmplPositionFulfillment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public EmplPositionFulfillment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<EmplPositionFulfillment> create(@RequestBody EmplPositionFulfillment entity) {
        EmplPositionFulfillment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public EmplPositionFulfillment update(@PathVariable Long id, @RequestBody EmplPositionFulfillment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}