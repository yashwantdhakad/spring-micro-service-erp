package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ReturnItemShipment;
import com.monash.erp.wms.service.ReturnItemShipmentService;
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
@RequestMapping("/api/return-item-shipments")
public class ReturnItemShipmentController {

    private final ReturnItemShipmentService service;

    public ReturnItemShipmentController(ReturnItemShipmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReturnItemShipment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReturnItemShipment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ReturnItemShipment> create(@RequestBody ReturnItemShipment entity) {
        ReturnItemShipment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ReturnItemShipment update(@PathVariable Long id, @RequestBody ReturnItemShipment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}